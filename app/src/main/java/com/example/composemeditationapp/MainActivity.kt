package com.example.composemeditationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import com.example.composemeditationapp.ui.theme.ComposeMeditationAppTheme
import com.example.composemeditationapp.views.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMeditationAppTheme {
                Column(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFFAF7ED),
                        )
                        .fillMaxSize()
                ) {
                  HomePage()
                }
            }
        }
    }
}

