package com.stah.jetrakuma.feature.notification

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.stah.jetrakuma.ui.components.TabItem
import com.stah.jetrakuma.ui.components.Tabs
import com.stah.jetrakuma.ui.components.TabsContent

@ExperimentalPagerApi
@ExperimentalMaterialApi
@Composable
fun NotificationScreen() {
    val tabs = listOf(
        TabItem.Music,
        TabItem.Movies,
        TabItem.Books
    )
    val pagerState = rememberPagerState()
    Scaffold(
      //  topBar = { TopBar() },
    ) {
        Column {
            Tabs(tabs = tabs, pagerState = pagerState)
            TabsContent(tabs = tabs, pagerState = pagerState)
        }
    }

}



