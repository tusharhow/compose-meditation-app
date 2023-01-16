package com.example.composemeditationapp.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import com.example.composemeditationapp.models.PostModel
import com.example.composemeditationapp.ui.theme.Purple200
import com.example.composemeditationapp.ui.theme.Teal200

val PostList = listOf(
    PostModel(
        "43 mins",
        "Tushar Mahmud",
        "Love meditation",
        "During loving kindness meditation, you focus benevolent and loving energy toward yourself and others.",
        backgroundColor = Color(0xFFFBF1A3),
        Black,
        Teal200
    ),
    PostModel(
        "34 mins",
        "Kale Jones",
        "Yoga meditation",
        "Outdoor concentration meditation, the object is a flower.",
        backgroundColor = Color(0xFFB3DDC6),
        Black,
        Yellow
    ),
    PostModel(
        "15 mins",
        "David Warner",
        "Breath Warm",
        "A 5-minute intro to meditation, relax and inhale to start.",
        Black,
        White,
        Purple200
    )
)