package com.example.epamandroidtest;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.textView1);
        Toast.makeText(getApplicationContext(), "toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_2", Toast.LENGTH_LONG).show();

        text.setText(R.string.myText);



    }






}
