package com.example.littlelemon

import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationComposable(navController: NavHostController, sharedPreferences: SharedPreferences) {

    NavHost(navController = navController,
            startDestination = if (sharedPreferences.getString("email","").isNullOrEmpty())
                                    Onboarding.route
                                else
                                    Home.route)
    {
        composable(Home.route) {
            Home()
        }
        composable(Onboarding.route)
        {
            Onboarding(navController, sharedPreferences)
        }
        composable(Profile.route)
        {
            Profile()
        }
    }
}