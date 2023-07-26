package com.test.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Browsing : AppCompatActivity() {
    lateinit var btnsw: Button
    lateinit var editText: EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browsing)
        val enterwebsite = findViewById<EditText>(R.id.edittext)
        val showButton = findViewById<Button>(R.id.btnsw)

        showButton.setOnClickListener {


                if (enterwebsite.text.isBlank()) {
                    Toast.makeText(this, "Enter the url", Toast.LENGTH_SHORT).show()

                } else {
                    val intent = Intent(this, Webview::class.java)
                        intent.putExtra("url", enterwebsite.text.toString()); // getText() SHOULD NOT be static!!!
                        startActivity(intent)


                }
            }
        }

    }



