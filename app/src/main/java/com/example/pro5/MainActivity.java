package com.example.pro5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
//
//    Create an application that has screens
//
//        screen 1: Login module - on successful login display next screen (screen 2)
//        screen 2:  fill the form - users will fill the form, collect data such as Name, age, CIA 1, CIA 2, CIA 3 marks
//        screen 3: gets the data from screen 2 and calculate the total marks,
//        additional option to add co-curricular,Open elective credits. should be given
//        screen 4: Dashboard displays result in a neat format, Name, Class, Email, Marks, Grade, GPA ...etc
//
//        Consider the best possible layout, design, options, elements, views keeping in mind the best user experience
//        for the APP user.
//        For Passing data between the activity use Explicit intent. (refer to sample programs that are already posted in Google classroom)
