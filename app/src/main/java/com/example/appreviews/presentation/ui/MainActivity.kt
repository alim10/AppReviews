package com.example.appreviews.presentation.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.appreviews.common.component.LargeSpacer
import com.example.appreviews.core.navigations.Activities
import com.example.appreviews.core.navigations.Navigator
import com.example.appreviews.presentation.theme.AppReviewsTheme
import com.example.appreviews.presentation.theme.ColorWhite
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject




@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var provider: Navigator.Provider
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppReviewsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    ContentUI(this, provider)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ContentUI(context: Activity, provider: Navigator.Provider) {

    Column {
        Text(
            text = "Hello !",
        )

        Button(
            onClick = {
                moveToNextActivity(context, provider)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Submit",
                style = TextStyle(
                    color = ColorWhite, textAlign = TextAlign.Center
                )
            )
        }
        LargeSpacer()
        LargeSpacer()
        LargeSpacer()
        LargeSpacer()
        LargeSpacer()
        Button(
            onClick = {
                moveToNextActivity(context, provider)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Submit",
                style = TextStyle(
                    color = ColorWhite, textAlign = TextAlign.Center
                )
            )
        }

        LargeSpacer()
        LargeSpacer()
        LargeSpacer()

        Button(
            onClick = {
                moveToNextActivity(context, provider)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Submit",
                style = TextStyle(
                    color = ColorWhite, textAlign = TextAlign.Center
                )
            )

        }

        LargeSpacer()
        LargeSpacer()
        LargeSpacer()
        LargeSpacer()
        LargeSpacer()


    }
}

fun startActivity(intent: Intent) {

}

fun moveToNextActivity(context: Activity, provider: Navigator.Provider) {
//    context.startActivity(Intent(context, Activities.AuthActivity::class.java))
    provider.getActivities(Activities.ForgotPassActivity).navigate(context)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppReviewsTheme {
//        ContentUI(this)
        Greeting("Android")
    }
}


