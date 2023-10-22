package com.example.appreviews.apps

import com.example.appreviews.auth.GoToAuthActivity
import com.example.appreviews.core.navigations.Activities
import com.example.appreviews.core.navigations.Navigator


class DefaultNavigator : Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToAuthActivity
            }
//            Activities.SearchActivity -> {
//                GoToSearchActivity
//            }
            Activities.AuthActivity -> TODO()
        }
    }
}