package com.example.appreviews.common.component

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appreviews.presentation.theme.AppReviewsTheme
import com.example.appreviews.presentation.theme.ColorPrimary
import com.example.appreviews.presentation.theme.ColorYellow

@Composable
fun StatusDotView(isActive: Boolean) {
    CharacterStatusDotContentView(
        isActive = isActive,
    )
}

@Composable
private fun CharacterStatusDotContentView(
    isActive: Boolean
) {
    Spacer(
        Modifier
            .size(12.dp)
            .clip(CircleShape)
            .background(
                when {
                    isActive -> ColorPrimary
                    else -> ColorYellow
                }
            )
    )
}

@Preview(
    showBackground = true,
    name = "Light Mode"
)
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun CharacterStatusDotViewPreview() {
    AppReviewsTheme {
        StatusDotView(isActive = true)
    }
}