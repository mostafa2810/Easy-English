package com.eltrend.american

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.cardview.widget.CardView
import com.google.android.gms.ads.*

class Level4 : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level4)
        MobileAds.initialize(this, "ca-app-pub-6572711285388576~9413494046")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6572711285388576/5119343042"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        var cr1 = findViewById<View>(R.id.cr1) as CardView
        cr1.setOnClickListener {
            mInterstitialAd.adListener = object : AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Level4, Level4Books::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Level4, Level4Books::class.java))
            }
        }
        var cr2=findViewById<View>(R.id.cr2)as CardView
        cr2.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Level4,Level4Audio::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Level4,Level4Audio::class.java))
            }

        }
        var cr3=findViewById<View>(R.id.cr3)as CardView
        cr3.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Level4, Level4Videos::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Level4, Level4Videos::class.java))
            }

        }
        var cr4=findViewById<View>(R.id.cr4)as CardView
        cr4.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Level4, Level4Exam::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Level4, Level4Exam::class.java))
            }

        }
    }
}