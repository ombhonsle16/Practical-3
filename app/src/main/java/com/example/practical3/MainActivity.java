package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    private EditText Name,Email,phone,Age;

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Name);
        Email = (EditText) findViewById(R.id.Email);
        phone = (EditText) findViewById(R.id.phone);
        Age = (EditText) findViewById(R.id.Age);
        btn1 = findViewById(R.id.btn1);
        TextView txt = (TextView) findViewById(R.id.txt);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String N= Name.getText().toString();
                String E= Email.getText().toString();
                String P= phone.getText().toString();
                String A=Age.getText().toString();
                txt.setText("Name:"+N+"\nEmail:"+E+"\nPhone:"+P+"\nAge:"+A);


            }
        });
    }
}