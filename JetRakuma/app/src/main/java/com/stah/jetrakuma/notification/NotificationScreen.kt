package com.stah.jetrakuma.notification

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.stah.jetrakuma.R
import com.stah.jetrakuma.ui.components.TabItem
import com.stah.jetrakuma.ui.components.Tabs
import com.stah.jetrakuma.ui.components.TabsContent
import com.stah.jetrakuma.ui.components.TextTabs

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

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.purple_200),
        contentColor = Color.Blue
    )
}



