package com.eltrend.american

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MoreApps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_apps)
        var cr1 = findViewById<View>(R.id.cr1) as LinearLayout
        cr1.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.eltrend.toefl_ipt")
            startActivity(i)

        }
        var cr2 = findViewById<View>(R.id.cr2) as LinearLayout
        cr2.setOnClickListener{
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://play.google.com/store/apps/details?id=com.eltrend.toefl")
            startActivity(i)

        }
    }
}