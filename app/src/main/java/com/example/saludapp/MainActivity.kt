package com.example.saludapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn_Show_Name.setOnClickListener{ }

    }

    fun checkValue() {
        if (Edit_Text_Name.text.isNotEmpty()) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", Edit_Text_Name.text)
            startActivity(intent)
        } else {
            showErrorName()
        }

    }

    fun showErrorName() {
        Toast.makeText(this, "El nombre del usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
    }

}
