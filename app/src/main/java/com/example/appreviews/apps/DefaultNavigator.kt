package com.example.appreviews.apps

import com.example.appreviews.auth.GoToAuthActivity
import com.example.appreviews.auth.GoToForgotActivity
//import com.example.appreviews.auth.GoToForgotActivity
import com.example.appreviews.core.navigations.Activities
import com.example.appreviews.core.navigations.Navigator
import com.example.appreviews.presentation.ui.GoToMainActivity


class DefaultNavigator : Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.AuthActivity -> {
                GoToAuthActivity
            }
            Activities.ForgotPassActivity -> {
                GoToForgotActivity
            }

            Activities.MainActivity ->  {
                GoToMainActivity
            }
        }
    }
}