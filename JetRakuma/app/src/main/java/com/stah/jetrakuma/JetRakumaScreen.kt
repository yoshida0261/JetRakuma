package com.stah.jetrakuma

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

enum class JetRakumaScreen(
    val icon: ImageVector
) {
    Home(
        icon = Icons.Filled.Home
    ),
    Search(
        icon = Icons.Filled.Search
    ),
    Notice(
        icon = Icons.Filled.Notifications
    ),
    MyPage(
        icon = Icons.Filled.Person
    );

    companion object {
        fun fromRoute(route: String?): JetRakumaScreen =
            when (route?.substringBefore("/")) {
                Home.name -> Home
                Search.name -> Search
                Notice.name -> Notice
                MyPage.name -> MyPage
                else -> Home
            }
    }
}
