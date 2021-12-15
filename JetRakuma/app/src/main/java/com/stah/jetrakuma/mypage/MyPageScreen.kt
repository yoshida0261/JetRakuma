package com.stah.jetrakuma.mypage

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyPageScreen() {
    Box(Modifier.fillMaxSize()) {
        Header()
        MypageMenu()
        Column() {
            Spacer(modifier = Modifier.height(24.dp))
            Avatar()
        }
    }
}
