package com.example.pro5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button button;
    TextView nameDisplay,ageDisplay, totalDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button = (Button) findViewById(R.id.button4);
        nameDisplay = findViewById(R.id.textView18);
        ageDisplay = findViewById(R.id.textView22);
        totalDisplay = findViewById(R.id.textViewTotal);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            String total = bundle.getString("total");
            nameDisplay.setText(name);
            ageDisplay.setText(age);
            totalDisplay.setText(total);
            Toast.makeText(getApplicationContext(), total, Toast.LENGTH_SHORT).show();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);

            }
        });
    }
}