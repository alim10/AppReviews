package com.example.appreviews.auth.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColorScheme(
    primary = ColorPrimary,
    secondary = ColorSecondary,
    surfaceTint = ColorAccent
)

private val lightColorPalette = lightColorScheme(
    primary = ColorPrimary,
    secondary = ColorSecondary,
    surfaceTint = ColorAccent,

    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
)

@Composable
fun CustomAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        lightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}