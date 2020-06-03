package com.vitorota.pocfontsize

import android.app.Application

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        setFixedFontScale()
    }

}