package com.androidpractice.heloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        val btn = findViewById(R.id.btn) as Button
        var etm = findViewById(R.id.etm) as EditText
        var edp = findViewById(R.id.edp) as EditText
        btn.setOnClickListener {
            val Maillid = etm.text.isBlank()
            val Password = edp.text.isBlank()
         if(Maillid || Password) {
            Toast.makeText(this, " Enter the required details.", Toast.LENGTH_LONG).show()
        }else{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        }
    }
}
