package dev.ogabek.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val me = Me("Ogabek", "Matyakubov")
            shareInfoToSecondActivity(me)
        }
    }

    private fun shareInfoToSecondActivity(user: Me) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }

}