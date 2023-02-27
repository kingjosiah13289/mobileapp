package com.erickwere.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncal:Button
    lateinit var ButtonWeb:Button
    lateinit var ButtonIntent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Buttoncal=findViewById(R.id.Btn_Calc)
        ButtonWeb=findViewById(R.id.Btn_web)
        ButtonIntent=findViewById(R.id.Btn_Intent)

        Buttoncal.setOnClickListener {

            val calcl=Intent(this,CalculatorActivity::class.java)
            startActivity(calcl)

        }
        ButtonWeb.setOnClickListener {
            val webs=Intent(this,WebActivity::class.java)
            startActivity(webs)

        }
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)

        }










    }
}