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

    public static final String EXTRA_NAME_4 = "com.example.pro5.extra.NAME.act4";
    public static final String EXTRA_AGE_4 = "com.example.pro5.extra.AGE.act4";
    public static final String EXTRA_TOTAL_4 = "com.example.pro5.extra.TOTAL.act4";
    public static final String EXTRA_GPA_4 = "com.example.pro5.extra.GPA.act4";
    public static final String EXTRA_ELECTIVE_4 = "com.example.pro5.extra.ELECTIVE.act4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button = (Button) findViewById(R.id.button4);
        nameDisplay = findViewById(R.id.textView18);
        ageDisplay = findViewById(R.id.textView22);
        totalDisplay = findViewById(R.id.textViewTotal);
        electiveMarks = (EditText) findViewById(R.id.editTextNumber5);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity3.EXTRA_NAME);
        String age = intent.getStringExtra(MainActivity3.EXTRA_AGE);
        String total = intent.getStringExtra(MainActivity3.EXTRA_TOTAL);
        String gpa = intent.getStringExtra(MainActivity3.EXTRA_GPA);

        nameDisplay.setText(name);
        ageDisplay.setText(age);
        totalDisplay.setText(total);

        String passName = nameDisplay.getText().toString();
        String passAge = ageDisplay.getText().toString();
        String passTotal = totalDisplay.getText().toString();


        button.setOnClickListener(view -> {
            String electiveMark = electiveMarks.getText().toString();
            Intent intent1 = new Intent(MainActivity4.this, MainActivity5.class);
            intent1.putExtra(EXTRA_NAME_4,passName);
            intent1.putExtra(EXTRA_TOTAL_4,passTotal);
            intent1.putExtra(EXTRA_AGE_4,passAge);
            intent1.putExtra(EXTRA_GPA_4,gpa);
            intent1.putExtra(EXTRA_ELECTIVE_4,electiveMark);
            startActivity(intent1);

        });
    }
}