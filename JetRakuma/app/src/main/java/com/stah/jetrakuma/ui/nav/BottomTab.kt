package com.stah.jetrakuma.ui.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavigationIcon(
    val icon: ImageVector
) {
    Home(
        icon = Icons.Filled.Home
    ),
    Search(
        icon = Icons.Filled.Search
    ),
    Add(
        icon = Icons.Filled.PhotoCamera
    ),
    MyPage(
        icon = Icons.Filled.Person
    );

    companion object {
        fun fromRoute(route: String?): BottomNavigationIcon =
            when (route?.substringBefore("/")) {
                Home.name -> Home
                Search.name -> Search
                Add.name -> Add
                MyPage.name -> MyPage
                else -> Home
            }
    }
}
