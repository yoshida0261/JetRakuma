package com.stah.jetrakuma.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@ExperimentalComposeUiApi
@Composable
fun HomeScreen() {
    Column {
        HomeSearchInput()
        PhotoGrid(modifier = Modifier.weight(1f))
        JetRakumaBottomNavigation()
    }
}

@ExperimentalComposeUiApi
@Composable
fun HomeSearchInput() {
    Row() {
        Box(
            Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp)
        ) {
            Icon(
                Item.Search.icon, contentDescription = null,
            //    modifier = Modifier.background(Color.Gray)
            )
        }
        SearchInputText(
            text = "",
            onTextChange = {},
            modifier = Modifier
//                .padding(horizontal = 16.dp)
               // .background(Color.Gray)
                .weight(1f),
            onImeAction = {}
        )

    }
}
