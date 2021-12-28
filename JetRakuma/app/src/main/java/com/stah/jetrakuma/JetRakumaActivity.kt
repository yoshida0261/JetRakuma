package com.stah.jetrakuma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.stah.jetrakuma.ui.nav.BottomTab
import com.stah.jetrakuma.feature.home.HomeBody
import com.stah.jetrakuma.feature.home.HomeScreen
import com.stah.jetrakuma.feature.mypage.MyPageScreen
import com.stah.jetrakuma.feature.notification.NotificationScreen
import com.stah.jetrakuma.feature.search.SearchScreen
import com.stah.jetrakuma.ui.theme.JetRakumaTheme

class JetRakumaActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    @ExperimentalPagerApi
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetRakumaApp()
        }
    }
}


@ExperimentalFoundationApi
@ExperimentalMaterialApi
@ExperimentalPagerApi
@ExperimentalComposeUiApi
@Composable
fun JetRakumaApp(){
    JetRakumaTheme {
        val allScreens = BottomTab.values().toList()
        val navController = rememberNavController()
        val backstackEntry = navController.currentBackStackEntryAsState()
        val currentScreen = BottomTab.fromRoute(
            backstackEntry.value?.destination?.route
        )

        Scaffold (bottomBar = {
            HomeScreen(
                allScreens = allScreens,
                onTabSelected = { screen->
                    navController.navigate(screen.name)
                },
                currentScreen = currentScreen
            )
        }) {
            NavHost(
                navController = navController,
                startDestination = BottomTab.Home.name
                //   modifier = Modifier.padding(innerPadding)
            ) {
                composable(BottomTab.Home.name) {
                    HomeBody()
                }
                composable(BottomTab.Search.name) {
                    SearchScreen()
                }
                composable(BottomTab.Add.name) {
                    NotificationScreen()
                }
                composable(BottomTab.MyPage.name) {
                    MyPageScreen()
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetRakumaTheme {

    }
}


