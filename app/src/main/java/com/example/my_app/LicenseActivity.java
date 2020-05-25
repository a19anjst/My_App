package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LicenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);
        TextView textView = findViewById(R.id.TextLicense);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String textLicense = extras.getString("textLicense");
            textView.setText(textLicense);
        }
        Button close = findViewById(R.id.go_back3);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    }

