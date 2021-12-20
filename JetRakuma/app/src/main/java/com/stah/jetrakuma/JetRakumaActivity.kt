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
import com.stah.jetrakuma.ui.nav.BottomNavigationIcon
import com.stah.jetrakuma.home.HomeBody
import com.stah.jetrakuma.home.HomeScreen
import com.stah.jetrakuma.mypage.MyPageScreen
import com.stah.jetrakuma.notification.NotificationScreen
import com.stah.jetrakuma.search.SearchScreen
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
        val allScreens = BottomNavigationIcon.values().toList()
        val navController = rememberNavController()
        val backstackEntry = navController.currentBackStackEntryAsState()
        val currentScreen = BottomNavigationIcon.fromRoute(
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
                startDestination = BottomNavigationIcon.Home.name
                //   modifier = Modifier.padding(innerPadding)
            ) {
                composable(BottomNavigationIcon.Home.name) {
                    HomeBody()
                }
                composable(BottomNavigationIcon.Search.name) {
                    SearchScreen()
                }
                composable(BottomNavigationIcon.Add.name) {
                    NotificationScreen()
                }
                composable(BottomNavigationIcon.MyPage.name) {
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


