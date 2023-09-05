package com.example.desafiodiointernacionalizao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.desafiodiointernacionalizao.ui.theme.DesafioDIOInternacionalizaçãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesafioDIOInternacionalizaçãoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color.LightGray) {
                    Column(verticalArrangement = Arrangement.Center) {
                        Greeting()
                        Spacer(modifier = Modifier.padding(120.dp))
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    val greetingsMessage = stringResource(id = R.string.greetings)
    Text(
            text = greetingsMessage,
            modifier = modifier,
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            color = Color.Blue
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesafioDIOInternacionalizaçãoTheme {
        Greeting()
    }
}