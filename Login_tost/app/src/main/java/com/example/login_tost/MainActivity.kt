package com.example.login_tost

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context


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
        val login : Button =findViewById(R.id.login_btn)
        val edittext:EditText=findViewById(R.id.Username_et)
        val edittext2:EditText=findViewById(R.id.Password_et)

        // setting up button click  event

        login.setOnClickListener{

        val username=edittext.text.toString()
        val password=edittext2.text.toString()
        var status:String

            if(username=="admin" && password=="admin"){

                status="Login Ok"
            }
            else{
                status="Login Unsuccesfull"
            }
            //Displaying


            Toast.makeText(this,status,Toast.LENGTH_LONG).show()

        }

    }
}