package com.stah.jetrakuma.mypage

import androidx.compose.material.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stah.jetrakuma.R
import com.stah.jetrakuma.ui.theme.Ocean3
import com.stah.jetrakuma.ui.theme.Ocean8
import com.stah.jetrakuma.ui.theme.Shadow4

@Composable
fun Avatar(

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
}

@Composable
fun Header() {
    Spacer(
        modifier = Modifier
            .height(180.dp)
            .fillMaxWidth()
            .background(Brush.horizontalGradient(listOf(Shadow4, Ocean3)))
    )
}

@Composable
fun MypageMenu(){


        Icon(Icons.Filled.ShoppingCart, null, )


}
