package com.example.temperatureconverterapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.contact_us){
            Intent intent = new Intent(MainActivity.this,CallActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}