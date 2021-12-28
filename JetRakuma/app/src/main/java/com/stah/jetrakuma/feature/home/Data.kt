package com.stah.jetrakuma.feature.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Item(var dist: String, var icon: ImageVector) {
    object Home : Item("Home", Icons.Filled.Home)
    object Search : Item("Search", Icons.Filled.Search)
    object Notifications : Item("Notifications", Icons.Filled.Notifications)
    object Person : Item("Person", Icons.Filled.Person)

}
