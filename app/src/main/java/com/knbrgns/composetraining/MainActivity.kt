package com.knbrgns.composetraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
fun MyBusinessCard(
    name: String,
    title: String,
    color: Color = Color.Black,
    modifier: Modifier = Modifier
) {
    Text(text = name, color = color, modifier = modifier.background(Color.Black))
    Text(text = title, color = Color.Green, modifier = modifier)

}

@Preview(showBackground = true)
@Composable
fun MyBusinessCardPreview() {
    Surface(color = MaterialTheme.colorScheme.primary, modifier = Modifier.fillMaxSize()) {
        MyBusinessCard(
            name = "Enes",
            title = "Android Developer",
            color = Color.Red,
            modifier = Modifier.padding(16.dp)
        )

        MyBusinessCard(
            name = "Hasan",
            title = "Worker",
            color = Color.Blue,
            modifier = Modifier.padding(46.dp)
        )
    }
}