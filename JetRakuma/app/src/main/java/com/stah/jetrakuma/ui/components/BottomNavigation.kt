package com.stah.jetrakuma.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.stah.jetrakuma.home.Item

@Preview
@Composable
fun JetRakumaBottomNavigation () {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(Item.Home, Item.Search, Item.Notifications, Item.Person)

    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                modifier = Modifier.background(Color.White),
                icon = { Icon(item.icon, contentDescription = null, tint = Color.Gray) },
                label = { Text(item.dist, color = Color.Gray) },
                alwaysShowLabel = false,
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}
