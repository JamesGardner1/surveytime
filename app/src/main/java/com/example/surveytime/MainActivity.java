package com.example.surveytime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mNoButton;
    Button mSuperNoButton;
    TextView mNoValue;
    TextView mSuperNoValue;
    Button mResetButton;

    int noCounter = 0;
    int superNoCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNoButton = findViewById(R.id.noButton);
        mSuperNoButton = findViewById(R.id.superNoButton);
        mNoValue = findViewById(R.id.noValue);
        mSuperNoValue = findViewById(R.id.superNoValue);
        mResetButton = findViewById(R.id.resetButton);

        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noCounter = noCounter + 1;
                mNoValue.setText(String.valueOf(noCounter));
            }
        });

        mSuperNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                superNoCounter = superNoCounter + 1;
                mSuperNoValue.setText(String.valueOf(superNoCounter));
            }
        });

        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                superNoCounter = 0;
                noCounter = 0;
                mNoValue.setText(String.valueOf(noCounter));
                mSuperNoValue.setText(String.valueOf(superNoCounter));
            }
        });
    }


}
