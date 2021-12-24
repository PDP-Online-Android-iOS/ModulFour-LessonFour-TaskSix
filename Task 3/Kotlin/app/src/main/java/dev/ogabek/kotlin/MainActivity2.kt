package dev.ogabek.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initViews()
        getInfo()

    }

    private fun initViews() {
        textView = findViewById(R.id.textView)
    }

    private fun getInfo() {
        val me = intent.getParcelableExtra<Me>("user")
        textView.text = me.toString()
    }

}