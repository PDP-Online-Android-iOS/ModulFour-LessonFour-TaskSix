package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        initViews()
        getInfo()

    }

    private fun initViews() {
        textView = findViewById(R.id.textView)
    }

    private fun getInfo() {
        val me = intent.getSerializableExtra("user")
        textView.text = me.toString()
    }

}