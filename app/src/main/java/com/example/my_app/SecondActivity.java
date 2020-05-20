package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.godtext);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String location = extras.getString("location");
            String power = extras.getString("power");
            String names = extras.getString("names");
            String gender = extras.getString("gender");
            textView.setText("The " + gender + " " + names + " lives in " + location + " and has the power of " + power);
        }
        Button close = findViewById(R.id.go_back);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
