package dev.ogabek.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
        getInfo();

    }

    void initViews() {
        textView = findViewById(R.id.textView);
    }

    void getInfo() {
        Me me = getIntent().getParcelableExtra("user");
        textView.setText(me.toString());
    }

}