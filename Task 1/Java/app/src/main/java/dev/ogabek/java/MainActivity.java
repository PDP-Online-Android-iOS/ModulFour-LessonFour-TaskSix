package dev.ogabek.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    void initViews() {
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareInfoToInformationActivity();
            }
        });
    }

    void shareInfoToInformationActivity() {
        Intent intent = new Intent(this, InformationActivity.class);
        intent.putExtra("name", "Ogabek");
        intent.putExtra("surname", "Matyakubov");
        startActivity(intent);
    }

}