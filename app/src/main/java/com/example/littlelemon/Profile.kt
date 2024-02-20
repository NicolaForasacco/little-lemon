package com.example.littlelemon

import android.content.SharedPreferences
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.edit
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Profile (navController: NavHostController,
             sharedPreferences: SharedPreferences?){



    Column {

        Image(
            painter = painterResource(id = R.drawable.Logo),
            contentDescription = "Logo",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Text(text = "Profile information")
        Text(text = sharedPreferences?.getString("firstName","").toString())
        Text(text = sharedPreferences?.getString("lastName","").toString())
        Text(text = sharedPreferences?.getString("email","").toString())

        Button(
            onClick = {

                sharedPreferences?.edit(commit = true) {
                    putString("email", "");
                    putString("firstName", "");
                    putString("lastName", "");
                }

                navController?.navigate(Onboarding.route);
            }
        ) {
            Text("Log out")
        }

        /*TopAppBar()
        UpperPanel()
        LowerPanel(navController, DishRepository.dishes)*/
    }
}

@Composable
@Preview
fun ProfileScreenPreview(){
    Profile(navController = rememberNavController(), null);
}