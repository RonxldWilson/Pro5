package com.example.pro5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView nameDash,AgeDash,EmailDash,MarksDash,ELeDash,gpaDash;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        nameDash = (TextView) findViewById(R.id.textView19);
        AgeDash = (TextView) findViewById(R.id.textView23);
        EmailDash = (TextView) findViewById(R.id.textView25);
        MarksDash = (TextView) findViewById(R.id.textView29);
        ELeDash = (TextView) findViewById(R.id.textView31);
        gpaDash  = (TextView) findViewById(R.id.textView27);

        Intent intent = getIntent();
        String nameD = intent.getStringExtra(MainActivity4.EXTRA_NAME_4);
        String marksD = intent.getStringExtra(MainActivity4.EXTRA_TOTAL_4);
        String ageD = intent.getStringExtra(MainActivity4.EXTRA_AGE_4);
        String gpaD = intent.getStringExtra(MainActivity4.EXTRA_GPA_4);
        String ele = intent.getStringExtra(MainActivity4.EXTRA_ELECTIVE_4);

        nameDash.setText(nameD);
        AgeDash.setText(ageD);
        EmailDash.setText("ronwilson0001@gmail.com");
        MarksDash.setText(marksD);
        ELeDash.setText(ele);
        gpaDash.setText(gpaD);
    }
}