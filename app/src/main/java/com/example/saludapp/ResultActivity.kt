package com.example.saludapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Btn_Back.setOnClickListener{onBackPressed( )}
        getAndShowName()
    }


    fun getAndShowName() {
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        Text_View_Greeting.text = ("Bienvenido $name")
    }
}