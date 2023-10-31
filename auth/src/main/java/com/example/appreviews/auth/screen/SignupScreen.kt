package com.example.appreviews.auth.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appreviews.auth.components.CustomButton
import com.example.appreviews.auth.components.CustomOutlinedTextField
import com.example.appreviews.auth.components.CustomPasswordTextField
import com.example.appreviews.core.R
import com.example.appreviews.auth.components.CustomTextTitle
import com.example.appreviews.auth.components.CustomTextTitleMedium
import com.example.appreviews.core.theme.AppPadding
import com.example.appreviews.core.theme.ColorWhite

@Composable
fun SignupScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(ColorWhite)
            .padding(AppPadding.large_I)
    ) {
        Column {

            CustomTextTitle(value = stringResource(id = R.string.txt_login))
            CustomTextTitleMedium(value = stringResource(id = R.string.txt_login))
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppPadding.large_I)
            )



            Row {
                CustomOutlinedTextField(
                    labelValue = stringResource(id = R.string.txt_user_name),
                    painterResource(id = R.drawable.ic_person)
                )

                CustomOutlinedTextField(
                    labelValue = stringResource(id = R.string.txt_user_name),
                    painterResource(id = R.drawable.ic_person)
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppPadding.large_I)
            )
            CustomOutlinedTextField(
                labelValue = stringResource(id = R.string.txt_user_name),
                painterResource(id = R.drawable.ic_person)
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppPadding.large_I)
            )
            CustomPasswordTextField(
                labelValue = stringResource(id = R.string.txt_user_name),
                painterResource(id = com.example.appreviews.auth.R.drawable.ic_password_unvisibility)
            )

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(AppPadding.large_IIII)
            )

            CustomButton(textButton = stringResource(id = R.string.txt_login),
                onClick = {
//                    CountryCodePickers()
//                    val phoneNumber = rememberSaveable { mutableStateOf("") }
//                    TextField(
//                        modifier = Modifier
//                            .fillMaxWidth(),
//                        value = phoneNumber.value,
//                        onValueChange = { phoneNumber.value = it },
//                        placeholder = { Text(text = "Phone Number") },
//                        leadingIcon = {
//                            KomposeCountryCodePicker(
//                                modifier = Modifier,
//                                showOnlyCountryCodePicker = true,
//                                showCountryFlag = false,
//                            )
//                        },
//                        colors = TextFieldDefaults.colors(
//                            unfocusedContainerColor = Color.Transparent,
//                            focusedContainerColor = Color.Transparent,
//                        ),
//                    )
                })

        }
    }
}



@Preview
@Composable
fun DefaultPreviewSignup() {
    SignupScreen()
}



@Composable
fun CountryCodePicker() {
    var phoneNumber: String by rememberSaveable { mutableStateOf("") }
    var fullPhoneNumber: String by rememberSaveable { mutableStateOf("") }
    var isNumberValid: Boolean by rememberSaveable { mutableStateOf(false) }
//
//    TogiCountryCodePicker(
//        modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
//        onValueChange = { (code, phone), isValid ->
//            Log.d("CCP", "onValueChange: $code $phone -> $isValid")
//
//            phoneNumber = phone
//            fullPhoneNumber = code + phone
//            isNumberValid = isValid
//        },
//        label = { Text("Phone Number") },
//    )

}



