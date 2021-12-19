package com.stah.jetrakuma.mypage

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@ExperimentalFoundationApi
@Composable
fun MyPageScreen() {
    //Header()
    Column(Modifier.fillMaxSize()) {
//            Spacer(modifier = Modifier.height(24.dp))
        TopBar()
        MyPageItems(modifier = Modifier.padding(start = 16.dp, end = 16.dp))

    }
}
