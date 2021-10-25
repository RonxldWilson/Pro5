package com.example.pro5;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText name;
    EditText age;
    EditText cia1, cia2, cia3;
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
        String cia01 = cia1.getText().toString();
        String cia02 = cia2.getText().toString();
        String cia03 = cia3.getText().toString();
        int total = 0;
        try{
            total = Integer.parseInt(cia01) +Integer.parseInt(cia02) +Integer.parseInt(cia03);
        }
        catch (NumberFormatException e){
            Toast.makeText(MainActivity3.this, "Error", Toast.LENGTH_SHORT).show();
        }
        int finalTotal = total;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameText = name.getText().toString();
                String ageText = age.getText().toString();
                String totalText = Integer.toString(finalTotal);

                Bundle bundle = new Bundle();
                bundle.putString("name", nameText);
                bundle.putString("age", ageText);
                bundle.putString("total",totalText);
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}