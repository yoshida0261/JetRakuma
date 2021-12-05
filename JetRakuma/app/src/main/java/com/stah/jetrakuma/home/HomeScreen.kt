package com.stah.jetrakuma.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Column() {
        // topbar todo

        PhotoGrid(modifier = Modifier.weight(1f))
        JetRakumaBottomNavigation()
    }
}

