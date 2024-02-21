package com.example.littlelemon;

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview;
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.room.Room

@Composable
fun Home (navController: NavHostController, database: MenuDatabase){

    val menuItems by database.menuDao().getAllMenuItems().observeAsState(emptyList())

    Column {
        TopAppBar(navController = navController)
        HeroSection(menuItems)
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    //Home(navController = rememberNavController(), database = MenuDatabase());
}