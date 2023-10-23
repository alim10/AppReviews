package com.example.appreviews.auth.components


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction.Companion.Done
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.sp
import com.example.appreviews.auth.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(labelValue: String) {
    val textValue = remember {
        mutableStateOf("")
    }

//    OutlinedTextField(
//        label = Text(labelValue),
//
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            focusedBorderColor = ColorPrimary,
//            focusedLabelColor = ColorPrimary,
//            cursorColor = ColorPrimary,
//        ),
//        keyboardActions = KeyboardActions.Default,
//        value = textValue.value,
//        onValueChange = {
//            textValue.value = it
//        }
//    )
}



