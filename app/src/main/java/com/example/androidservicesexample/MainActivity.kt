package com.example.androidservicesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    private  lateinit var status :TextView
    private  lateinit var btnStart :Button
    private  lateinit var btnStop :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        status = findViewById(R.id.status)
        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)

        btnStart.setOnClickListener {
            startService(Intent(this, MyService::class.java))
            status.text = "Playing"
        }

        btnStop.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
            status.text = "Stop"
        }
    }
}