package com.example.pro5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button button;
    TextView nameDisplay,ageDisplay,totalDisplay;
    EditText electiveMarks;
//    public static final String EXTRA_NAME_4 = "com.example.pro5.extra.NAME.act4";
//    public static final String EXTRA_AGE_4 = "com.example.pro5.extra.AGE.act4";
//    public static final String EXTRA_TOTAL_4 = "com.example.pro5.extra.TOTAL.act4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = (Button) findViewById(R.id.button4);
        nameDisplay = findViewById(R.id.textView18);
        ageDisplay = findViewById(R.id.textView22);
        totalDisplay = findViewById(R.id.textViewTotal);
        electiveMarks = findViewById(R.id.editTextNumber5);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity3.EXTRA_NAME);
        String age = intent.getStringExtra(MainActivity3.EXTRA_AGE);
        String total = intent.getStringExtra(MainActivity3.EXTRA_TOTAL);

        nameDisplay.setText(name);
        ageDisplay.setText(age);
        totalDisplay.setText(total);

        button.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent1);

        });
    }
}