package br.edu.fatecpg.catalogoturistico.view

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.catalogoturistico.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class WebViewActivity : AppCompatActivity(R.layout.activity_web_view) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fabVoltar = findViewById<FloatingActionButton>(R.id.fab_voltar)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true

        val url = intent.getStringExtra("urlDestino") ?: "https://google.com"
        myWebView.loadUrl(url)

        fabVoltar.setOnClickListener {
            finish()
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}