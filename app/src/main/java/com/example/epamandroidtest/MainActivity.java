package com.example.epamandroidtest;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);
        Toast.makeText(getApplicationContext(), "toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_2", Toast.LENGTH_LONG).show();

        text.setText(R.string.myText);


        button1.setText(R.string.button1_new_text);
    }
}
