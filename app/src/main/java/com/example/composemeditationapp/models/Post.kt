package com.example.composemeditationapp.models

data class PostModel(
    val duration: String,
    val teacher: String,
    val title: String,
    val description: String,
    val backgroundColor: androidx.compose.ui.graphics.Color,
    val contentColor: androidx.compose.ui.graphics.Color,
    val timeBackgroundColor: androidx.compose.ui.graphics.Color
)