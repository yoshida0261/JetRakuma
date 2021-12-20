package com.stah.jetrakuma.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.stah.jetrakuma.ui.nav.BottomNavigationIcon
import com.stah.jetrakuma.ui.components.JetRakumaBottomNavigation
import com.stah.jetrakuma.ui.components.TopBarInput

@ExperimentalComposeUiApi
@Composable
fun HomeScreen(
    allScreens: List<BottomNavigationIcon>,
    onTabSelected: (BottomNavigationIcon) -> Unit,
    currentScreen: BottomNavigationIcon
) {
        //Column {
            //    HomeSearchInput()
            //  PhotoGrid(modifier = Modifier.weight(1f))
            JetRakumaBottomNavigation(
                allScreen = allScreens,
                onTabSelected = onTabSelected,
                currentScreen = currentScreen
            )
      //  }

}

@ExperimentalComposeUiApi
@Composable
fun HomeBody(){
    Scaffold( topBar = {TopBarInput()}) {
        Column {
            //HomeSearchInput()
            PhotoGrid(modifier = Modifier.weight(1f))
        }
    }
}

