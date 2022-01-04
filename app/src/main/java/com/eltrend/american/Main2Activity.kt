package com.eltrend.american

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds


class Main2Activity : AppCompatActivity() {
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        MobileAds.initialize(this,"ca-app-pub-6572711285388576~9413494046")
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6572711285388576/5119343042"
        mInterstitialAd.loadAd(AdRequest.Builder().build())


        val cm= baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo!= null && networkInfo.isConnected){

            if (networkInfo.type == ConnectivityManager.TYPE_WIFI){
                Toast.makeText(baseContext,"Connected Via WIFI Network", Toast.LENGTH_LONG).show()
            }

            if (networkInfo.type == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(baseContext,"Connected Via MOBILE Network", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(baseContext,"No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        var LinearLayout =findViewById<View>(R.id.cr1) as LinearLayout
        LinearLayout.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,HowToUseTheApp::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,HowToUseTheApp::class.java))
            }
        }
        var LinearLayout2 =findViewById<View>(R.id.cr2) as LinearLayout
        LinearLayout2.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,placementestActivity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,placementestActivity::class.java))
            }
        }
        var LinearLayout3 =findViewById<View>(R.id.cr3) as LinearLayout
        LinearLayout3.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,EasyEnglish::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,EasyEnglish::class.java))
            }



        }
        var LinearLayout4 =findViewById<View>(R.id.cr4) as LinearLayout
        LinearLayout4.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,MoreApps::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,MoreApps::class.java))
            }



        }
        var LinearLayout5 =findViewById<View>(R.id.cr5) as LinearLayout
        LinearLayout5.setOnClickListener {
            mInterstitialAd.adListener = object: AdListener() {
                override fun onAdClosed() {
                    // Code to be executed when the interstitial ad is closed.
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                    startActivity(Intent(this@Main2Activity,contactusActivity::class.java))

                }
            }
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                startActivity(Intent(this@Main2Activity,contactusActivity::class.java))
            }



        }


    }
}