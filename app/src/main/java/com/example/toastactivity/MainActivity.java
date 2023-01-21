package com.example.toastactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assign id
        txt = findViewById(R.id.text);
        btn = findViewById(R.id.button);

        //generate the event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //generate toast
                //getApplicationContext == show the current activity
                //""+txt == what message show in toast

                Toast.makeText(getApplicationContext(),""+txt.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}