package com.stah.jetrakuma.search

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.ui.components.TopBarInput

@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun SearchScreen() {
    Scaffold(topBar = { TopBarInput() }) {
        Column {
            Text("人気のカテゴリ")
            CategoryItems(modifier = Modifier.weight(1f).padding(16.dp))
        }
    }
}
