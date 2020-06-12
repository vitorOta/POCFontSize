package com.vitorota.pocfontsize

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : NonScalableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = localClassName
        labelInfo.text = "* with android:configChanges=\"fontScale\" *"
        button.setOnClickListener {
            finish()
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
