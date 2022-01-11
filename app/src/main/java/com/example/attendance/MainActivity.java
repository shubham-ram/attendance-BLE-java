package com.example.attendance;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = findViewById(R.id.button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Shubham") && password.getText().toString().equals("JSR")){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULLY", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(MainActivity.this, "LOGIN Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
    

    
}