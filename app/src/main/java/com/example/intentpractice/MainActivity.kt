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

            val inputMessage1 = messageEdt1.text.toString()
            val inputMessage2 = messageEdt2.text.toString()
            val myIntent = Intent(this, MessageActivity::class.java)
            myIntent.putExtra("message1", inputMessage1 )
            myIntent.putExtra("message2", inputMessage2 )

            startActivity(myIntent)


        }

        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }
    }
}