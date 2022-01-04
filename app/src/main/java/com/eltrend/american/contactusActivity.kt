package com.eltrend.american

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class contactusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)
        var cr1 = findViewById<View>(R.id.cr1) as CardView
        cr1.setOnClickListener {
            startActivity(Intent(this@contactusActivity,Phone::class.java))
        }
        var cr2 = findViewById<View>(R.id.cr2) as CardView
        cr2.setOnClickListener {
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://www.messenger.com/t/100019467914124")
            startActivity(i)
        }
        var cr3 = findViewById<View>(R.id.cr3) as CardView
        cr3.setOnClickListener {
            var i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://www.facebook.com/profile.php?id=100019467914124")
            startActivity(i)
        }

    }
}