package com.stah.jetrakuma.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.stah.jetrakuma.ui.theme.JetRakumaTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetRakumaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    JetRakumaBottomNavigation()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetRakumaTheme {
        Greeting("Android")
    }
}



@Composable
fun JetRakumaBottomNavigation () {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(Item.Home, Item.Search, Item.Notifications, Item.Person)

    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = null) },
                label = { Text(item.dist) },
                alwaysShowLabel = false,
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}