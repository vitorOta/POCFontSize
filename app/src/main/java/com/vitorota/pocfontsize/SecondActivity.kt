package com.vitorota.pocfontsize

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : NonScalableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = localClassName
        labelInfo.text = "* withOUT android:configChanges=\"fontScale\" *"
        button.setOnClickListener {
            finish()
            startActivity(Intent(this, MainActivity::class.java))
        }
        layout.setBackgroundColor(Color.LTGRAY)
    }
}
