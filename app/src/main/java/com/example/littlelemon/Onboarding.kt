package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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

@Composable
fun Onboarding() {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        /*Image(

            contentDescription = "Upper Panel Image",
            modifier = Modifier.clip(RoundedCornerShape(10.dp))
        )*/

        TextField(
            value = firstName,
            onValueChange = {firstName = it },
            label = { Text("First name") }
        )

        TextField(
            value = lastName,
            onValueChange = {lastName = it },
            label = { Text("Last name") }
        )

        TextField(
            value = email,
            onValueChange = {email = it },
            label = { Text("Email address") }
        )

        Button(
            onClick = { }
        ) {
            Text("Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    Onboarding()
}