package com.stah.jetrakuma.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import com.stah.jetrakuma.ui.components.JetRakumaBottomNavigation
import com.stah.jetrakuma.ui.components.TopBarInput
import com.stah.jetrakuma.ui.nav.BottomTab

@ExperimentalComposeUiApi
@Composable
fun HomeScreen(
    allScreens: List<BottomTab>,
    onTabSelected: (BottomTab) -> Unit,
    currentScreen: BottomTab
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
fun HomeBody() {
    Scaffold(topBar = {
        TopBarInput()
    }
    ) {
        Column {
            PhotoGrid(modifier = Modifier.weight(1f))
        }
    }
}

