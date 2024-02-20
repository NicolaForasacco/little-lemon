package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun TopAppBar(navController: NavHostController) {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(id = R.drawable.Logo),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier.fillMaxWidth(0.5F)
                .padding(horizontal = 20.dp)
        )

        IconButton(onClick = { navController.navigate(Profile.route) }) {
            Image(
                painter = painterResource(id = R.drawable.Profile),
                contentDescription = "Profile",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar(navController = rememberNavController())
}
