package com.alim.letsconnect.auth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alim.letsconnect.core.navigations.Navigator
import com.alim.letsconnect.core.theme.MyAppTheme
import com.joelkanyi.jcomposecountrycodepicker.component.CountryCodePicker
import com.joelkanyi.jcomposecountrycodepicker.component.KomposeCountryCodePicker
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class AuthActivity1 : ComponentActivity() {

    companion object {
        fun launchActivity(activity: Activity) {
            val intent = Intent(activity, AuthActivity1::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setStatusBarColor(
                    color = MaterialTheme.colorScheme.primary,
                    false,
                )
                systemUiController.setSystemBarsColor(
                    color = MaterialTheme.colorScheme.primary,
                    false,
                )
                MainContenet()
            }
        }
    }


}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun MainContenet() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Kompose Country Code Picker",
                        style = MaterialTheme.typography.titleMedium,
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                ),
            )
        },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            val phoneNumber = rememberSaveable { mutableStateOf("") }

            KomposeCountryCodePicker(
                modifier = Modifier
                    .fillMaxWidth(),
                text = phoneNumber.value,
                onValueChange = { phoneNumber.value = it },
                placeholder = {
                    Text(
                        text = "Phone Number",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.ExtraLight,
                        ),
                    )
                },
                shape = MaterialTheme.shapes.medium,
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                ),
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get country code
                 */
                /**
                 * Get country code
                 */
                Text(text = "Country Phone No Code: ")
                Text(
                    text = CountryCodePicker.getCountryPhoneCodeWithoutPrefix(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Prefixed country code
                 */
                /**
                 * Prefixed country code
                 */
                Text(text = "Prefixed Country Phone No Code: ")
                Text(
                    text = CountryCodePicker.getCountryPhoneCode(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get country name
                 */
                /**
                 * Get country name
                 */
                Text(text = "Country Name: ")
                Text(
                    text = CountryCodePicker.getCountryName(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get country language code
                 */
                /**
                 * Get country language code
                 */
                Text(text = "Country Language Code: ")
                Text(
                    text = CountryCodePicker.getCountryCodeWithoutPrefix()
                        .uppercase(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get phone number
                 */
                /**
                 * Get phone number
                 */
                Text(text = "Phone Number: ")
                Text(
                    text = CountryCodePicker.getPhoneNumber(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get phone number without prefix
                 */
                /**
                 * Get phone number without prefix
                 */
                Text(text = "Phone Number Without Prefix: ")
                Text(
                    text = CountryCodePicker.getPhoneNumberWithoutPrefix(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get full phone number
                 */
                /**
                 * Get full phone number
                 */
                Text(text = "Full Phone Number: ")
                Text(
                    text = CountryCodePicker.getFullPhoneNumber(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Get full phone number without prefix
                 */
                /**
                 * Get full phone number without prefix
                 */
                Text(text = "Full Phone Number Without Prefix: ")
                Text(
                    text = CountryCodePicker.getFullPhoneNumberWithoutPrefix(),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                /**
                 * Check if phone number is valid
                 */
                /**
                 * Check if phone number is valid
                 */
                Text(text = "Phone Number State: ")
                Text(
                    text = if (CountryCodePicker.isPhoneNumberValid()) "Valid" else "Invalid",
                    color = if (CountryCodePicker.isPhoneNumberValid()) Color.Green else Color.Red,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.ExtraBold,
                    ),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MAinActivityPreview() {
    // Use MaterialTheme for the preview
    MaterialTheme {
        MainContenet()
    }
}


object GoToAuthActivity1 : Navigator {

    override fun navigate(activity: Activity) {
        AuthActivity1.launchActivity(activity)
    }
}
