package com.example.instastoryclone.ui.story

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instastoryclone.data.model.Story

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(stories) { story ->
            StoryItem(story)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StoryListPreview() {
    val sampleStories = listOf(
        Story("Your Story", "https://your-image-url.com/1.jpg"),
        Story("karennne", "https://your-image-url.com/2.jpg", isLive = true),
        Story("zackjohn", "https://your-image-url.com/3.jpg"),
        Story("kieron_d", "https://your-image-url.com/4.jpg"),
        Story("craig_", "https://your-image-url.com/5.jpg")
    )

    StoryList(stories = sampleStories)
}