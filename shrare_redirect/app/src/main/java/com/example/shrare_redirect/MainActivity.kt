package com.example.shrare_redirect
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.net.Uri
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val redirect : Button =findViewById(R.id.btn)
        redirect.setOnClickListener{
            val redirect=Intent(this,MainActivity2::class.java)
            startActivity(redirect)
        }
        val redirect_2:Button=findViewById(R.id.btn2)
        val url="https://www.google.com"
        redirect_2.setOnClickListener {
            val redirect2=Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(redirect2)
        }
    }
}