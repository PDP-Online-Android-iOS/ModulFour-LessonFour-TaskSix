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
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val me = Me("Ogabek", "Matyakubov")
            shareInfoToMainActivity2(me)
        }
    }

    private fun shareInfoToMainActivity2(user: Me) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }

}