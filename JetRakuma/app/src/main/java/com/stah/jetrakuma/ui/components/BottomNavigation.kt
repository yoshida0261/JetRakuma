package com.stah.jetrakuma.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.stah.jetrakuma.ui.nav.BottomNavigationIcon

@Composable
fun JetRakumaBottomNavigation (onTabSelected: (BottomNavigationIcon) -> Unit,
                               allScreen: List<BottomNavigationIcon>,
                               currentScreen: BottomNavigationIcon
                               ) {
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
