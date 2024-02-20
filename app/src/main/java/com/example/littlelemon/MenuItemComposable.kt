package com.example.littlelemon

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.littlelemon.ui.theme.LittleLemonColor

@OptIn(ExperimentalMaterial3Api::class, ExperimentalGlideComposeApi::class)
@Composable
fun MenuItemComposable(dish: MenuItem) {
    Card(onClick = {}) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)){
            Column(modifier = Modifier.fillMaxWidth(0.75f)) {
                Text(
                    text = dish.title,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier
                        .padding(8.dp)
                )
                Text(
                    text = dish.description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(0.75f)

                )
                Text(
                    text = "$${dish.price}",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier
                        .padding(8.dp)
                )

            }
            GlideImage(
                model = dish.image,
                contentDescription = "Dish image",
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            )
        }
    }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        thickness = 1.dp,
        color = LittleLemonColor.yellow
    )
}