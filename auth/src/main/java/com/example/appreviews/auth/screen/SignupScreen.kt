package com.example.appreviews.auth.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appreviews.core.R
import com.example.appreviews.auth.components.CustomTextTitle
import com.example.appreviews.auth.components.CustomTextTitleMedium
import com.example.appreviews.auth.ui.theme.ColorWhite

@Composable
fun SignupScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
            .background(ColorWhite)
        ){
        CustomTextTitle(value = stringResource(id = R.string.txt_login))
        CustomTextTitleMedium(value = stringResource(id = R.string.txt_login))

    }
}

@Preview
@Composable
fun DefaultPreviewSignup() {
    SignupScreen()
}