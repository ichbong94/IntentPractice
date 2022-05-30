package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendMessageBtn.setOnClickListener {

            val inputMessage = messageEdt.text.toString()
            val myIntent = Intent(this, MessageActivity::class.java)
            myIntent.putExtra("message", inputMessage )
            startActivity(myIntent)


        }

        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }
    }
}