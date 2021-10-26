package edu.bo.ucb.loginapplication

import android.app.Application

val session: Prefs by lazy {
    App.prefs!!
}

class App: Application() {
    companion object {
        var prefs: Prefs? = null
    }
    override fun onCreate() {
        prefs = Prefs(applicationContext)
        super.onCreate()
    }
}