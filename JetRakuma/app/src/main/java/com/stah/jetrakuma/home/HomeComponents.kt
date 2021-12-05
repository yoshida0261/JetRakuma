package com.stah.jetrakuma.home

import android.graphics.drawable.BitmapDrawable

import android.provider.ContactsContract
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat

@Preview
@Composable
fun JetRakumaBottomNavigation () {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf(Item.Home, Item.Search, Item.Notifications, Item.Person)

    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                modifier = Modifier.background(Color.White),
                icon = { Icon(item.icon, contentDescription = null, tint = Color.Gray) },
                label = { Text(item.dist, color = Color.Gray) },
                alwaysShowLabel = false,
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}

@ExperimentalComposeUiApi
@Composable
fun SearchInputText(
    text: String,
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    onImeAction: () -> Unit = {}
){
    val keyboardController = LocalSoftwareKeyboardController.current
    TextField(
        value = text,
        label = { Text("キーワードで検索")},
        onValueChange = onTextChange,
        colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent),
        maxLines = 1,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(onDone = {
            onImeAction()
            keyboardController?.hide()
        }),
        modifier = modifier
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGrid(modifier: Modifier) {
    val list = (1..100).map { it.toString() }

    LazyVerticalGrid(
        cells = GridCells.Fixed(3),
        modifier = modifier,

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        content = {
            items(list.size) { index ->
                Card(
                    backgroundColor = Color.Red,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(),
                    elevation = 8.dp,
                ) {
                    Text(
                        text = list[index],
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    )

}
