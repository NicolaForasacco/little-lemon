package com.example.littlelemon;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview;

@Composable
fun Home (){
        Column {
            Image(
                painter = painterResource(id = R.drawable.Logo),
                contentDescription = "Logo",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )


            /*TopAppBar()
            UpperPanel()
            LowerPanel(navController, DishRepository.dishes)*/
        }
}

@Composable
@Preview
fun HomeScreenPreview(){
        Home();
        }