package com.example.intentpractice

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editnickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editnickname)

        okBtn.setOnClickListener {

            val inputNewNickName = newNickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickName )
            setResult(Activity.RESULT_OK, resultIntent)
            finish()

        }


    }
}