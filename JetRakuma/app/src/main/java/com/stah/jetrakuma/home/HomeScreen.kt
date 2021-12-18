package com.stah.jetrakuma.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.JetRakumaScreen
import com.stah.jetrakuma.ui.components.JetRakumaBottomNavigation
import com.stah.jetrakuma.ui.components.TopBarInput

@ExperimentalComposeUiApi
@Composable
fun HomeScreen(
    allScreens: List<JetRakumaScreen>,
    onTabSelected: (JetRakumaScreen) -> Unit,
    currentScreen: JetRakumaScreen
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

