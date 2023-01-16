package com.example.composemeditationapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composemeditationapp.data.PostList
import com.example.composemeditationapp.models.PostModel

@Composable
fun PostComp() {
 
        val postList = PostList
        LazyColumn(
            Modifier.padding(15.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(PostList.size) {
                PostItem(post = postList[it])
            }
        }
    
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PostItem(post: PostModel) {
    Card(
        shape = RoundedCornerShape(14.dp),
        modifier = Modifier.fillMaxSize(),
        backgroundColor = post.backgroundColor
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(20.dp)
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Chip(
                    onClick = { /*TODO*/ },
                    colors = ChipDefaults.chipColors(
                        contentColor = Black,
                        backgroundColor = post.timeBackgroundColor
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = post.duration)
                }
                Chip(
                    onClick = { /*TODO*/ },
                    colors = ChipDefaults.chipColors(
                        contentColor = Black,
                        backgroundColor = White
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = post.teacher)
                }
            }

            Text(
                text = post.title,
                fontSize = 18.sp,
                color = post.contentColor,
                textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold
            )

            Text(
                text = post.description,
                fontSize = 15.sp,
                color = post.contentColor,
                textAlign = TextAlign.Start
            )
        }
    }
}
