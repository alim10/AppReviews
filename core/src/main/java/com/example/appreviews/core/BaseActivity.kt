package com.example.appreviews.core

import android.annotation.SuppressLint
import android.content.Context
import android.content.IntentFilter
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.appreviews.core.data.AppPreference
import com.example.appreviews.core.helper.LanguageHelper
import com.example.appreviews.core.helper.NetworkReceiver
import com.example.appreviews.core.utils.AppLogs
import com.example.appreviews.core.utils.Const
import com.example.appreviews.core.utils.FontsOverride
import com.google.android.gms.tasks.OnCompleteListener
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import com.google.firebase.messaging.FirebaseMessaging

abstract class BaseActivity : AppCompatActivity() {

    private var networkReceiver: NetworkReceiver? = null
    /*  date format   */
    lateinit var webFormat: SimpleDateFormat

    @Inject
    lateinit var preference: AppPreference
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(
            LanguageHelper.wrapper(
                newBase,
                preference.languageCode
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/SanFrancisco_Regular.otf")
        networkReceiver = NetworkReceiver()
        Const.SELECTED_LANGUAGE = preference.languageName
        Const.SELECTED_LANGUAGE_CODE = preference.languageCode
        initDateFormat()
        if (preference.accessToken.isEmpty()) {
            getFcmDeviceToken()
        }
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(networkReceiver, IntentFilter(Const.Action.NETWORK_ACTION))

    }

    @SuppressLint("SimpleDateFormat")
    private fun initDateFormat() {
        webFormat =
            SimpleDateFormat(Const.DATE_TIME_FORMAT_WEB, Locale(Const.SELECTED_LANGUAGE_CODE))
        webFormat.timeZone = TimeZone.getTimeZone("UTC")
    }

    /** getting FCM device token */
    private fun getFcmDeviceToken() {
        FirebaseMessaging.getInstance().token
            .addOnCompleteListener(
                OnCompleteListener { task ->
                    if (!task.isSuccessful) {
                        AppLogs.log(
                            Const.Tags.BASE_ACTIVITY,
                            "FCM registration token failed >> " + task.exception.toString()
                        )
                        return@OnCompleteListener
                    }
                    val deviceToken = task.result
                    AppLogs.log(Const.Tags.BASE_ACTIVITY, "Device Token >> $deviceToken")
                    preference.putDeviceToken(deviceToken)
                }
            )
    }

    fun isUserLogin(): Boolean {
        return !TextUtils.isEmpty(preference.userId)
    }






}
