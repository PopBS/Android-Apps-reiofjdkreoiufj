package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingImage(message = "Albeet Popu", from = "The Android Developer")
                    Contacts(number = "353891609522", email = "PopBS@protonmail.com")
                    Icons()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Blue) {
        Text(text = "Hi, my name is $name!", modifier = modifier.padding(14.dp))
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val hexColor = "#3DDC84"
    val TAD = "#026440"
    val android_dude = painterResource(R.drawable.android_logo)
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(android.graphics.Color.parseColor(hexColor)))
        ) {}

        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = android_dude,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(
                        0.dp, 180.dp
                    )
                    .size(120.dp)
                    .background(Color.Black)

            )
            Text(
                text = message,
                fontSize = 42.sp,
                lineHeight = 90.sp,
                color = Color(android.graphics.Color.parseColor(TAD)),
                modifier = Modifier
                    .offset(
                        0.dp, 180.dp
                    )
            )
            Text(
                text = from,
                fontSize = 19.sp,
                lineHeight = 30.sp,
                modifier = Modifier
                    .offset(
                        0.dp, 180.dp)
            )
        }
        
    }
}

@Composable
fun Contacts(number: String, email: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = number,
                fontSize = 21.sp,
                lineHeight = 30.sp,
                modifier = Modifier
                    .offset(
                        0.dp, 480.dp)
            )
            Text(
                text = email,
                fontSize = 21.sp,
                lineHeight = 30.sp,
                modifier = Modifier
                    .offset(
                        0.dp, 480.dp)
            )
        }
    }

}


@Composable
fun Icons(modifier: Modifier = Modifier) {
    val email_image = painterResource(R.drawable.ic_email)
    val phone_image = painterResource(R.drawable.ic_phone)
    Box(modifier = Modifier) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = phone_image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(
                        -95.dp, 481.dp
                    )
                    .size(27.dp)
            )
            Image(
                painter = email_image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .offset(
                        -140.dp, 483.dp
                    )
                    .size(27.dp)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Albert")
    }
}
