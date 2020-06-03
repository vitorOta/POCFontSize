package com.vitorota.pocfontsize

import android.content.Context
import android.content.ContextWrapper
import android.view.WindowManager

fun ContextWrapper.setFixedFontScale() {
    val configuration = resources.configuration

    configuration.fontScale = 1f
    val metrics = resources.displayMetrics
    val wm = getSystemService(Context.WINDOW_SERVICE) as? WindowManager
        ?: return
    wm.defaultDisplay.getMetrics(metrics)
    metrics.scaledDensity = configuration.fontScale * metrics.density
}

/**
 * create a new context with the configuration.fontScale = 1f
 */
fun Context.withOriginalFontScale(): Context {
    val configuration = resources.configuration
    configuration.fontScale = 1f
    return createConfigurationContext(configuration)
}