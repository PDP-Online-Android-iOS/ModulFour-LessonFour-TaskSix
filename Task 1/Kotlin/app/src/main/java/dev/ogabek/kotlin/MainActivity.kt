package dev.ogabek.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            shareInfoToInformationActivity()
        }
    }

    private fun shareInfoToInformationActivity() {
        val intent = Intent(this, InformationActivity::class.java)
        intent.putExtra("name", "Ogabek")
        intent.putExtra("surname", "Matyakubov")
        startActivity(intent)
    }

}