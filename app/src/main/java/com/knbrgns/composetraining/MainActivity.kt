package com.knbrgns.composetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.knbrgns.composetraining.ui.theme.ComposeTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTrainingTheme {
                Surface() {

                }
            }
        }
    }
}

@Composable
fun MyBusinessCard(name: String, title: String, color: Color = Color.Black, modifier: Modifier = Modifier) {
    Text(text = name, color = color)
    Text(text = title, color = Color.Green)

}

@Preview(showBackground = true)
@Composable
fun MyBusinessCardPreview() {
    Surface(color = MaterialTheme.colorScheme.primary, modifier = Modifier.fillMaxSize()) {
        MyBusinessCard(name = "Enes", title = "Android Developer", color = Color.Red)
    }
}