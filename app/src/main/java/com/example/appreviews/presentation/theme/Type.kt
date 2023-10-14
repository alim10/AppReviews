package com.example.appreviews.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.appreviews.R
import com.example.appreviews.apps.AppText


val gothicA1 = FontFamily(
    listOf(
        Font(R.font.sanfrancisco_thin, FontWeight.Thin),
        Font(R.font.sanfrancisco_regular, FontWeight.Normal),
        Font(R.font.sanfrancisco_medium, FontWeight.Medium),
        Font(R.font.sanfrancisco_bold, FontWeight.SemiBold),
        Font(R.font.sanfrancisco_bold, FontWeight.Bold),
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Bold,
        fontSize = AppText.appTextLabelLargest
    ),
    headlineMedium = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.SemiBold,
        fontSize = AppText.appTextLabelLarge
    ),
    headlineSmall = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Medium,
        fontSize = AppText.appTextLabelMedium
    ),
    titleLarge = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Medium,
        fontSize = AppText.appTextMedium
    ),
    titleMedium = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Medium,
        fontSize = AppText.appTextRegular
    ),
    titleSmall = TextStyle(
        color = ColorAppText,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Medium,
        fontSize = AppText.appTextRegular
    ),

    bodyLarge = TextStyle(
        color = ColorAppTextLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = AppText.appTextRegular
    ),
    bodyMedium = TextStyle(
        color = ColorAppTextLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = AppText.appTextLabelRegular,
    ),
    bodySmall = TextStyle(
        color = ColorAppTextLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = AppText.appTextLabelRegular,
    ),
    labelLarge = TextStyle(
        color = ColorAppTextExtraLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Thin,
        fontSize = AppText.appTextSmall
    ),
    labelMedium = TextStyle(
        color = ColorAppTextLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = AppText.appTextLabelSmall
    ),
    labelSmall = TextStyle(
        color = ColorAppTextLight,
        fontFamily = gothicA1,
        fontWeight = FontWeight.Normal,
        fontSize = AppText.appTextLabelSmall
    ),


)