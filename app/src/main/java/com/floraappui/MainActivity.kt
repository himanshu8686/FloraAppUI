package com.floraappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.floraappui.navigation.Navigation
import com.floraappui.ui.theme.FloraAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FloraAppUITheme {
                InitApplicationContent()
            }
        }
    }
}

@Composable
fun InitApplicationContent() {
    // A surface container using the 'background' color from the theme
    Surface(modifier = Modifier.fillMaxSize()) {
        Navigation()
    }
}