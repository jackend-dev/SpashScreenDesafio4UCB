package br.com.spashscreend4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_adidas.*

class AdidasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adidas)

        btnSiteAdidas.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.adidas.com.br/")
            )
            startActivity(intent)
        }
    }
}