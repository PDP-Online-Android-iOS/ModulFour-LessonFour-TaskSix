package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InformationActivity : AppCompatActivity() {

    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        initViews()
        getInfo()

    }

    private fun initViews() {
        txt = findViewById(R.id.name)
    }

    private fun getInfo() {
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        txt.text = "$name $surname"
    }

}