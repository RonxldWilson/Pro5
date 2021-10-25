package com.example.pro5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText name,age;
    EditText cia1, cia2, cia3;
    public static final String EXTRA_NAME = "com.example.pro5.extra.NAME";
    public static final String EXTRA_AGE = "com.example.pro5.extra.AGE";
    public static final String EXTRA_TOTAL = "com.example.pro5.extra.TOTAL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button)findViewById(R.id.button3);
        name = (EditText)findViewById(R.id.editTextTextPersonName2);

        age = (EditText)findViewById(R.id.editTextNumber);
        cia1 = (EditText)findViewById(R.id.editTextNumber2);
        cia2 = (EditText)findViewById(R.id.editTextNumber3);
        cia3 = (EditText)findViewById(R.id.editTextNumber4);
        //        Toast.makeText(getApplicationContext(), total, Toast.LENGTH_SHORT).show();


        button.setOnClickListener(view -> {
            int total = totalCiaMarks(cia1, cia2, cia3);
            String ageText = age.getText().toString();
            String nameText = name.getText().toString();
            String totalText = Integer.toString(total);

            Intent intent = new Intent(this, MainActivity4.class);
            intent.putExtra(EXTRA_NAME,nameText);
            intent.putExtra(EXTRA_AGE,ageText);
            intent.putExtra(EXTRA_TOTAL,totalText);
            startActivity(intent);
        });
    }
    private int totalCiaMarks( EditText cia1, EditText cia2, EditText cia3){
        int cia01 = Integer.parseInt(cia1.getText().toString());
        int cia02 = Integer.parseInt(cia2.getText().toString());
        int cia03 = Integer.parseInt(cia3.getText().toString());
        return (cia01 + cia02 + cia03);
    }
}