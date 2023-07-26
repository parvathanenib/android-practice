package com.test.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

private fun Any.onBackPressed() {
    TODO("Not yet implemented")
}

class Webview : AppCompatActivity() {
    private var webURL = "https://www.geeksforgeeks.org/android-webview-in-kotlin/"
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        webView = findViewById(R.id.webview)
        val ss: String = intent.getStringExtra("url").toString()

        Toast.makeText(this, ss, Toast.LENGTH_SHORT).show()
        val webview =findViewById<WebView>(R.id.webview)
        webview.loadUrl(ss)



        Log.i("URL", ss)


        webView.webViewClient = object : WebViewClient() {

//            val intent =openURL

        }
    }
}