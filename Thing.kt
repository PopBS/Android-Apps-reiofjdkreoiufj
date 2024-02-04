package com.example.birthdaycard

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "HAppy britdya to uuU",
                        from = "frum the goat albeet"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 35.sp,
            color = Color.Green,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(14.dp)
                .then(modifier)
        )
        Text(
            text = from,
            fontSize = 19.sp,
            lineHeight = 10.sp,
            modifier = Modifier
                .padding(10.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop ,
            alpha = 0.7F

        )
        Text(
            text = message,
            fontSize = 70.sp,
            color = Color.Green,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(60.dp)
                .align(alignment = Alignment.Center)

        )
        Text(
            text = from,
            fontSize = 19.sp,
            lineHeight = 10.sp,
            modifier = Modifier
                .padding(
                    start = 100.dp,
                    top = 600.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                )
        )
    }
}



@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        GreetingImage(message = "HAppy britdya", from = "frum the goat albeet")
    }
}
