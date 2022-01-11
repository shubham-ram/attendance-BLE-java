package com.example.attendance;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.scan);

        final BluetoothAdapter bAdapter = BluetoothAdapter.getDefaultAdapter();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bAdapter == null)
                {
                    Toast.makeText(MainActivity2.this,"Bluetooth Not Supported",Toast.LENGTH_SHORT).show();
                }else{
                    if(!bAdapter.isEnabled()){
                        startActivityForResult(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE),1);
                    }
                    if(bAdapter.isEnabled()){
                        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent);
                    }
                }
            }
        });
        if(bAdapter.isEnabled()){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
         }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 1){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
            Toast.makeText(MainActivity2.this, "Bluetooth on", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2.this, "blue off", Toast.LENGTH_SHORT).show();
        }

        super.onActivityResult(requestCode, resultCode, data);
    }


}