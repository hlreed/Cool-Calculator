package com.example.hope.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Function called when seven is pressed
    public void buttonSevenPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.seven);
    }
    public void buttonEightPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.eight);
    }
    public void buttonNinePressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.nine);
    }
    public void buttonXPressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_text);
        result.setText(R.string.x);
    }
}
