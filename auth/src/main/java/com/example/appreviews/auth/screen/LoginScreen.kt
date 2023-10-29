package com.example.appreviews.auth.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.appreviews.auth.components.CustomOutlinedTextField
import com.example.appreviews.auth.components.CustomTextTitle
import com.example.appreviews.auth.components.CustomTextTitleMedium
import com.example.appreviews.core.AppPadding
import com.example.appreviews.core.AppSize
import com.example.appreviews.core.MediumSpacer
import com.example.appreviews.core.R
import com.example.appreviews.core.theme.ColorWhite

@Composable
fun LoginScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(ColorWhite)
            .padding(AppPadding.pLarge)
    ) {
        Column {

            CustomTextTitle(value = stringResource(id = R.string.txt_login))
            CustomTextTitleMedium(value = stringResource(id = R.string.txt_login))

            CustomOutlinedTextField(labelValue = stringResource(id = R.string.txt_user_name))

            MediumSpacer()
            CustomOutlinedTextField(labelValue = stringResource(id = R.string.txt_password))
        }
    }
}

@Preview
@Composable
fun DefaultPreviewLogin() {
    LoginScreen()
}