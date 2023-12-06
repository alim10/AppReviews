package com.alim.letsconnect.presentation

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import com.alim.letsconnect.core.navigations.Activities
import com.alim.letsconnect.core.navigations.Navigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class SplashActivity : ComponentActivity() {

    @Inject
    lateinit var provider: Navigator.Provider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            provider.getActivities(Activities.MainActivity)
        }, 1000)

    }
}
