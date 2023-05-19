package com.misaeljonathan.jitpacksample.logger

import android.util.Log

object JitpackLogger {

    val TAG = "JitpackSample19May"

    fun sendLog(message: String) {
        Log.d(TAG, message)
    }

    fun sendLog(tag:String, message: String) {
        Log.d(tag, message)
    }

    fun getName(): String {
        return "Misael"
    }

    fun getValue(): String {
        return "something"
    }
}