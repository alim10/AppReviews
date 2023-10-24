package com.example.appreviews.auth.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appreviews.auth.components.CustomOutlinedTextField
import com.example.appreviews.core.R
import com.example.appreviews.auth.components.CustomTextTitle
import com.example.appreviews.auth.components.CustomTextTitleMedium
import com.example.appreviews.core.theme.ColorWhite

@Composable
fun SignupScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(ColorWhite)
    ) {
        Column {

            CustomTextTitle(value = stringResource(id = R.string.txt_login))
            CustomTextTitleMedium(value = stringResource(id = R.string.txt_login))

            CustomOutlinedTextField(labelValue = stringResource(id = R.string.txt_user_name))
        }
    }
}

@Preview
@Composable
fun DefaultPreviewSignup() {
    SignupScreen()
}