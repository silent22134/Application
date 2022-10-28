package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvRiddle = findViewById<TextView>(R.id.tv_riddle)
        val edAnswer = findViewById<EditText>(R.id.ed_answer)
        val btnRiddle = findViewById<Button>(R.id.btn_riddle)
        val btnAnswer = findViewById<Button>(R.id.btn_answer)
        val btnReAnswer = findViewById<Button>(R.id.btn_reAnswer)
        val btnShowAnswer = findViewById<Button>(R.id.btn_showAnswer)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        var index = 0
        val riddleList = mutableListOf("0000")


        edAnswer.text = null
        tvResult.text = null
        btnRiddle.setOnClickListener{
            val countRiddle = riddleList.count()
            val (riddle,answer) = riddleList[index].split(":")
            tvRiddle.text = "謎題"+riddle
            index++
            if(index>=countRiddle) index=0
        }
    }
}