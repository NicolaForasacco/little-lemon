package com.example.littlelemon;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Home (navController: NavHostController){
    Column {
        TopAppBar(navController = navController)
        HeroSection()
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    Home(navController = rememberNavController());
}