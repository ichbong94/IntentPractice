package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//             실제로는 화면을 MainActivity를 더 만드르로 finish를 사용함            
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)
            
            finish()
        }
    }
}