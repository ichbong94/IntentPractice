package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

//        화면에 들어올 때 데이터 반영

        val intentMessage1 = intent.getStringExtra("message1")
        val intentMessage2 = intent.getStringExtra("message2")

        receviedMessageTxt.text = intentMessage1 + intentMessage2
    }
}