package com.alim.letsconnect.common.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alim.letsconnect.apps.AppCornerRadius
import com.alim.letsconnect.apps.AppHeight
import com.alim.letsconnect.apps.AppPadding
import com.alim.letsconnect.core.theme.ColorGrayExtraLight1
import com.alim.letsconnect.core.theme.Typography



@Composable
fun CustomEditField(
    text: String,
    onTextChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    hint: String = "",
    maxLines: Int = 1,
) {
    BasicTextField(
        value = text,
        onValueChange = {
            onTextChanged(it)
        },
        textStyle = Typography.bodyMedium,
        maxLines = maxLines,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp), // Adjust padding according to your layout
        decorationBox = { innerTextField ->
            Box(modifier = Modifier) {
                if (text.isEmpty()) {
                    Text(
                        text = hint,
//                        color = LocalContentColor.current.copy(alpha = ContentAlpha.medium)
                    )
                }
                innerTextField()
            }
        }
    )
}



@Composable
fun CustomMultiLineTextField(
    text: String,
    onTextChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    hint: String = "",
    minLine: Int = 1,
    maxLines: Int = 1,
) {
    BasicTextField(
        value = text,
        onValueChange = {
            onTextChanged(it)
        },
        textStyle = Typography.bodyMedium,
        singleLine = maxLines == minLine,
        maxLines = maxLines,
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp), // Adjust padding according to your layout
        decorationBox = { innerTextField ->
            Box(modifier = Modifier) {
                if (text.isEmpty()) {
                    Text(
                        text = hint,
//                        color = LocalContentColor.current.copy(alpha = ContentAlpha.medium)
                    )
                }
                innerTextField()
            }
        }
    )
}



@Composable
fun TwoLineTextField(
    text: String,
    onTextChanged: (String) -> Unit,


    modifier: Modifier = Modifier,
    hint: String = "",
    minLine: Int = 1,
    maxLines: Int = 1,
) {

    BasicTextField(
        value = text,
        onValueChange = {
            onTextChanged(it)
        },
        textStyle = Typography.bodyMedium,
//        singleLine = maxLines == minLine,
        singleLine = false,
        maxLines = maxLines,
        modifier = modifier
            .fillMaxWidth()
            .background(color = ColorGrayExtraLight1,
                shape = RoundedCornerShape(AppCornerRadius.large) )
            .heightIn(AppHeight.h_65)
            .padding(AppPadding.pRegular), // Adjust padding according to your layout
        decorationBox = { innerTextField ->
            Box(modifier = Modifier) {
                if (text.isEmpty()) {
                    Text(
                        text = hint,
//                        color = LocalContentColor.current.copy(alpha = ContentAlpha.medium)
                    )
                }
                innerTextField()
            }
        }
    )

//    var isFocused by remember { mutableStateOf(false) }
//
//    BasicTextField(
//        value = text,
//        onValueChange = onTextChange,
//        textStyle = TextStyle(fontSize = 16.sp),
//        modifier = Modifier
//            .padding(16.dp)
//            .border(1.dp, Color.Gray)
//            .background(Color.White)
//            .padding(8.dp)
//            .focusModifier(isFocused)
//            .heightIn(min = 64.dp), // Minimum height of 2 lines
//        singleLine = false, // Allow multiple lines
//        onFocusChanged = { focusState -> isFocused = focusState.isFocused }
//    )
}


