package com.stah.jetrakuma.feature.search

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.R

@ExperimentalFoundationApi
@Composable
fun CategoryItems(modifier: Modifier){
    val list = (1..9).map { it.toString() }

    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        modifier = modifier,

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        content = {
            items(list.size) { index ->
                Card(
                    backgroundColor = Color.White,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    elevation = 8.dp,
                ) {
                    Image( painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Test")
                    Text("Test")
                }
            }
        }
    )

}
