package com.example.temperatureconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
    }

    public void celToFah(View view){

        EditText userInputText = findViewById(R.id.inputText);

        String userInputS = userInputText.getText().toString();

        double userInputD = Double.parseDouble(userInputS);

        double output = (userInputD * 1.8) + 32;

        String outputString = Double.toString(output);

        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();
    }

    public void fahToCel(View view){

        EditText userInputText = findViewById(R.id.inputText);

        String userInputS = userInputText.getText().toString();

        double userInputD = Double.parseDouble(userInputS);

        double output = (userInputD -32) * 0.55;

        String outputString = Double.toString(output);

        Toast.makeText(getApplicationContext(),outputString,Toast.LENGTH_LONG).show();

    }
}