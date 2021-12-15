package com.stah.jetrakuma.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.JetRakumaScreen
import com.stah.jetrakuma.ui.components.JetRakumaBottomNavigation

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
    Column {
            HomeSearchInput()
          PhotoGrid(modifier = Modifier.weight(1f))
    }
}

@ExperimentalComposeUiApi
@Composable
fun HomeSearchInput() {
    Row() {
        Box(
            Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp)
        ) {
            Icon(
                Item.Search.icon, contentDescription = null,
            //    modifier = Modifier.background(Color.Gray)
            )
        }
        SearchInputText(
            text = "",
            onTextChange = {},
            modifier = Modifier
//                .padding(horizontal = 16.dp)
               // .background(Color.Gray)
                .weight(1f),
            onImeAction = {}
        )

    }
}
