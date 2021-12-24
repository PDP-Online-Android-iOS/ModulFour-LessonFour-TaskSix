package dev.ogabek.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    void initViews() {
        openBtn = findViewById(R.id.button);
        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Me me = new Me("Ogabek", "Matyakubov");
                shareInfoToSecondActivity(me);
            }
        });
    }

    void shareInfoToSecondActivity(Me user) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }

}