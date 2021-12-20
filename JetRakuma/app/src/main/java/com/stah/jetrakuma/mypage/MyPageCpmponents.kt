package com.stah.jetrakuma.mypage

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.R
import com.stah.jetrakuma.ui.theme.Ocean3
import com.stah.jetrakuma.ui.theme.Shadow4

@Composable
fun TopBar(
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 8.dp)
    ) {
        Column(

            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(

                painter = painterResource(R.drawable.bird),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Gray, CircleShape)   // add a border (optional)
            )

            Text(text = "プロフィール", Modifier.padding(top = 8.dp))
        }
        /*
        Spacer(modifier = Modifier.size(16.dp))
        Column(modifier = Modifier.weight(1F)) {

            Icon(Icons.Default.WbSunny, contentDescription = "Localized description", tint = Color.Red)
        }
        Icon(Icons.Default.Notifications, contentDescription = "Localized description", tint = Color.Red)

         */
    }
}

@Composable
fun MyCash(){

}


@ExperimentalFoundationApi
@Composable
fun MyPageItems(modifier: Modifier) {
    val list = (1..10).map { it.toString() }

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
                    backgroundColor = Color.White,
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    elevation = 8.dp,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "Test"
                    )
                    Text("Test")
                }
            }
        }
    )

}


@Composable
fun Header() {
    Spacer(
        modifier = Modifier
            .height(108.dp)
            .fillMaxWidth()
            .background(Brush.horizontalGradient(listOf(Shadow4, Ocean3)))
    )
}

@Composable
fun MypageMenu() {
    Icon(Icons.Filled.Money, null)
    Icon(Icons.Filled.ShoppingCart, null)
}
