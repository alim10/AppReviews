package com.example.appreviews.presentation.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.alim.letsconnect.R
import com.example.appreviews.apps.AppIconSize
import com.example.appreviews.apps.AppPadding

@Composable
fun AppRatingBar(
    rating: Float,
    size: Dp = AppIconSize.regular,
) {
    Box(
        contentAlignment = Alignment.CenterStart
    ) {
        Row {
            repeat(5) {
                val image = if (rating >= it + 0.75f) {
//                    R.drawable.ic_star_fill
                } else if (rating >= it + 0.25f) {
//                    R.drawable.ic_star_half
                } else {
//                    R.drawable.ic_star_empty
                }
//                Image(
//                    painter = painterResource(id = image),
//                    contentDescription = "Star",
//                    modifier = Modifier.size(size)
//                )
            }
        }
    }
}


//@Composable
//fun StarIcon(
//    size: Dp,
//    isFilled: Boolean,
//    isHalfFilled: Boolean,
//    onClick: () -> Unit,
//) {
//    val starImage: Painter = when {
//        isFilled -> painterResource(id = R.drawable.ic_star_fill)
//        isHalfFilled -> painterResource(id = R.drawable.ic_star_half)
//        else -> painterResource(id = R.drawable.ic_star_empty)
//    }
//
//    Image(
//        painter = starImage,
//        contentDescription = "Star",
//        modifier = Modifier
//            .clickable { onClick() }
//            .size(size)
//    )
//}


@Composable
fun AppRatingBarClickable(
    rating: Float,
    maxStar: Int,
    size: Dp = AppIconSize.regular,
    onRatingChanged: (Float) -> Unit,
) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.Center)
                .padding(AppPadding.pMedium),
            horizontalArrangement = spacedBy(AppPadding.pRegular),
        ) {
            for (i in 1..maxStar) {
                val starValue = i.toFloat()
                val isFilled = rating >= starValue
                val isHalfFilled = rating >= starValue - 0.5f && rating < starValue

//                StarIcon(
//                    size = size,
//                    isFilled = isFilled,
//                    isHalfFilled = isHalfFilled,
//                    onClick = { onRatingChanged(starValue) }
//                )
            }
        }
    }
}