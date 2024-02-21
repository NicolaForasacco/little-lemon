package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonColor

@Composable
fun HeroSection(dishes: List<MenuItem> = listOf()) {
    var filter by remember { mutableStateOf("") }
    var dishesFiltered = dishes;
    var categories = dishes.groupBy { it.category };

    var categoryFilter by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(LittleLemonColor.green)
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.yellow
        )
        Text(
            text = "Chicago",
            fontSize = 24.sp,
            color = LittleLemonColor.cloud
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            Text(
                text = "We are a family-owned Mediterranean restaurant, focused on traditional recipes served with a modern twist",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .padding(bottom = 28.dp, end = 20.dp)
                    .fillMaxWidth(0.6f), color = LittleLemonColor.cloud
            )
            Image(
                painter = painterResource(id = R.drawable.hero_image),
                contentDescription = "Upper Panel Image",
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            )
        }
        TextField(value = filter,
            onValueChange = { filter = it },
            placeholder = { Text("Enter search phrase") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") })



        Row {
            LazyRow {
                itemsIndexed(categories.keys.toList()) { _,
                                                         category ->
                    Button(onClick = { categoryFilter = category }) { Text(category) }
                }
            }
        }

        if (!filter.isNullOrEmpty()) {
            dishesFiltered = dishes.filter { it.title.contains(filter) }
        }

        if (!categoryFilter.isNullOrEmpty()) {
            dishesFiltered = dishes.filter { it.category.contentEquals(categoryFilter) }
        }

        MenuItemsComposable(dishesFiltered)
    }
}

@Preview(showBackground = true)
@Composable
fun HeroSectionPreview() {
    HeroSection()
}
