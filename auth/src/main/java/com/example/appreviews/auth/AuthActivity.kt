package com.example.appreviews.auth

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appreviews.auth.ui.theme.AppReviewsTheme
import com.example.appreviews.core.navigations.Activities
import com.example.appreviews.core.navigations.Navigator

class AuthActivity : ComponentActivity() {
    companion object{
        fun launchActivity(activity: Activity) {
            val intent = Intent(activity, AuthActivity::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppReviewsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppReviewsTheme {
        Greeting("Android")
    }
}

object GoToAuthActivity : Navigator {

    override fun navigate(activity: Activity) {
        AuthActivity.launchActivity(activity)
    }

}