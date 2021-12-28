package com.stah.jetrakuma.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.stah.jetrakuma.R
import com.stah.jetrakuma.feature.home.SearchInputText

@Composable
fun TopBar() {
    TopAppBar(
        title = { Text(text = stringResource(R.string.app_name), fontSize = 18.sp) },
        backgroundColor = colorResource(id = R.color.purple_200),
        contentColor = Color.Blue
    )
}

@ExperimentalComposeUiApi
@Composable
fun TopBarInput() {
    Row() {
        /*
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

         */
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
