package com.example.epamandroidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        Toast.makeText(getApplicationContext(), "toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second toast feature_2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "third toast feature_2", Toast.LENGTH_LONG).show();

        button1.setText(R.string.button1_new_text);
    }
}
