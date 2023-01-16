package com.example.composemeditationapp.views

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composemeditationapp.components.CategoryComp
import com.example.composemeditationapp.components.PostComp
import com.example.composemeditationapp.components.SearchComp
import com.example.composemeditationapp.components.TopAppBarComp

@Composable
fun HomePage() {
    TopAppBarComp()
    Spacer(modifier = Modifier.size(20.dp))
    SearchComp()
    Spacer(modifier = Modifier.size(20.dp))
    CategoryComp()
    Spacer(modifier = Modifier.size(20.dp))
    PostComp()
    Spacer(modifier = Modifier.size(20.dp))
}

