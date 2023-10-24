package com.example.appreviews.auth.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appreviews.core.theme.ColorPrimary


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomOutlinedTextField(labelValue: String) {
    var textValue by remember { mutableStateOf("Outlined Text") }
    OutlinedTextField(
        label = { Text(text = labelValue) },
        value = textValue,
//        textStyle = TextStyle(fontSize = 20.sp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = ColorPrimary,
            focusedLabelColor = ColorPrimary,
            cursorColor = ColorPrimary,
        ),
        keyboardOptions = KeyboardOptions.Default,
        keyboardActions = KeyboardActions(
            onDone = {
                // Handle the "Done" action
            }
        ),
        onValueChange = {
            textValue = it
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun CustomOutlinedTextField() {
    var text by remember { mutableStateOf("Outlined Text") }

    BasicTextField(
        value = text,
        onValueChange = { str->
            text = str
        },

        textStyle = TextStyle(fontSize = 20.sp),
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // Background color of the text field
            .padding(16.dp), // Add padding for spacing
        decorationBox = { innerTextField ->
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = Modifier
                    .background(Color.Gray) // Outline color
                    .padding(1.dp) // Outline thickness
            ) {
                innerTextField()
            }
        }
    )
}





