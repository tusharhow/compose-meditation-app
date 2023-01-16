package com.example.composemeditationapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryComp() {
    val selectedIndex = remember {
        mutableStateOf(0) // default selected index
    }
    val items = listOf("Stress", "Depression", "Anxiety","Yoga","Panic Attack")
    LazyRow(
        modifier = Modifier.padding(start = 10.dp, end = 10.dp )
    ) {
        items(items.size) {
            Card(
                modifier = Modifier
                    .width(120.dp)
                    .height(50.dp)
                    .padding(5.dp),

                shape = RoundedCornerShape(8.dp),
                backgroundColor = if (selectedIndex.value == it) Black else White,
                elevation = 1.dp
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.clickable {
                        selectedIndex.value = it
                        println("Selected Index: ${selectedIndex.value}")
                    }
                ) {
                    Text(
                        text = items[it],
                        style = TextStyle(
                            fontSize = 16.sp,
                            color = if (selectedIndex.value == it) White else Black,
                        )
                    )
                }

            }

        }
    }
}