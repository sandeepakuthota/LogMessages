package com.example.library

import android.content.Context
import android.util.Log

class LogMessage {

  companion object {
    public var tag:String = "Application Library";
    fun logmessage(c: Context?, message: String?) {

      Log.i(tag, message.toString())


    }
  }
}