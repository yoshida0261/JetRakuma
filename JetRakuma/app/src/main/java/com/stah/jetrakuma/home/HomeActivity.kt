package com.stah.jetrakuma.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.stah.jetrakuma.JetRakumaScreen
import com.stah.jetrakuma.ui.theme.JetRakumaTheme

class HomeActivity : ComponentActivity() {
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetRakumaApp()
        }
    }
}


@ExperimentalComposeUiApi
@Composable
fun JetRakumaApp(){
    JetRakumaTheme {
        val allScreens = JetRakumaScreen.values().toList()
        val navController = rememberNavController()
        val backstackEntry = navController.currentBackStackEntryAsState()
        val currentScreen = JetRakumaScreen.fromRoute(
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
                startDestination = JetRakumaScreen.Home.name
                //   modifier = Modifier.padding(innerPadding)
            ) {
                composable(JetRakumaScreen.Home.name) {
                    Text("home")
                }
                composable(JetRakumaScreen.Search.name) {
                    Text("search")
                }
                composable(JetRakumaScreen.Notification.name) {
                    Text("notification")
                }
                composable(JetRakumaScreen.Person.name) {
                    Text("person")
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


