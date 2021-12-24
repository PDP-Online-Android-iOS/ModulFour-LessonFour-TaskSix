package dev.ogabek.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        initViews();
        getInformation();

    }

    void initViews() {
        textView = findViewById(R.id.textView);
    }

    void getInformation() {
        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        textView.setText(name + " " + surname);
    }

}