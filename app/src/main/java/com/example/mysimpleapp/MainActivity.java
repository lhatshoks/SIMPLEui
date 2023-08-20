package com.example.mysimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.username);
        TextView Password =(TextView) findViewById(R.id.Password);

        MaterialButton loginbutton = (MaterialButton) findViewById(R.id.loginbutton);

        //admin and admin

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&& Password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this,"Login successful", Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}