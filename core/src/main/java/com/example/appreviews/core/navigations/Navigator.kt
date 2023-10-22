package com.example.appreviews.core.navigations

import android.app.Activity

interface Navigator {

    fun navigate(activity:Activity)

    interface Provider{
        fun getActivities(activities: Activities):Navigator
    }

}