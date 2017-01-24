package com.hackingbuzz.buttonusingimplements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);

    }

   @Override
    public void onClick(View v) {

        textView.setText("Button Clicked");

    }
}



/*
another way to take interface

    // view.OnClick      (dot here) attach two things together

View.OnClickListener oo = new View.OnClickListener() {
@Override
public void onClick(View v) {

        }
        };*/
