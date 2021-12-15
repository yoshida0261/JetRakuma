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
import com.stah.jetrakuma.JetRakumaScreen
import com.stah.jetrakuma.home.Item

@Composable
fun JetRakumaBottomNavigation (onTabSelected: (JetRakumaScreen) -> Unit,
                               allScreen: List<JetRakumaScreen>,
                               currentScreen: JetRakumaScreen
                               ) {
  //  var selectedItem by remember { mutableStateOf(0) }
    //val items = listOf(Item.Home, Item.Search, Item.Notifications, Item.Person)

    BottomNavigation {
        allScreen.forEach { screen->
            BottomNavigationItem(
                modifier = Modifier.background(Color.White),
                icon = { Icon(screen.icon, contentDescription = null,  tint = Color.Gray) },
                label = { Text(screen.name, color = Color.Gray) },
                alwaysShowLabel = false,
                selected = currentScreen == screen,
                onClick = {onTabSelected(screen)}
            )
        }
    }
}
