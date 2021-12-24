package dev.ogabek.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
        getInfo();

    }

    private void initViews() {
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Member member = new Member(true);
                backToMainActivity(member);
            }
        });
    }

    private void getInfo() {
        User user = (User) getIntent().getParcelableExtra("user");
        textView.setText(user.toString());
    }

    private void backToMainActivity(Member member) {
        Intent intent = new Intent();
        intent.putExtra("respond", member);
        setResult(RESULT_OK, intent);
        finish();
    }

}