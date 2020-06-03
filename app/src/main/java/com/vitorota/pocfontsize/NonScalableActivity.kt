package com.vitorota.pocfontsize

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Activity not affected by the font scale configuration from the android OS
 *
 * Remind to put the `configChanges:"fontScale"` in activity declaration inside the manifest
 *
 * ATTENTION: resources dimensions obtained in runtime could be different from activity's context,
 *  so will not keep the fontSize.
 * To assure that a context will keep the sizes,
 * use [Context.withOriginalFontScale][com.vitorota.pocfontsize.withOriginalFontScale]
 *
 */
abstract class NonScalableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFixedFontScale()
    }

    override fun attachBaseContext(newBase: Context?) {
        val newOverride = Configuration(newBase?.resources?.configuration)
        newOverride.fontScale = 1.0f
        applyOverrideConfiguration(newOverride)

        super.attachBaseContext(newBase)
    }
}