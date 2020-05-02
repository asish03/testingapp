package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{

    public static final String MSG ="testingapp.LOGIN";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clklogin(View view)
    {
        int counter=3;
        Button login = (Button)findViewById(R.id.loginbtn);
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById(R.id.password);

        if(username.getText().toString().equals("Asish") && password.getText().toString().equals("password"))
        {
//            correct password body
            Toast.makeText(this, "Redirecting....", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent( this, doctorlogin.class);
            String message = username.getText().toString() + " welcome home";
            intent.putExtra(MSG, message);
            startActivity(intent);
        }else
        {
//            wrong password body
            Toast.makeText(this, "Wrong Credentials..", Toast.LENGTH_SHORT).show();
            username.setVisibility(View.VISIBLE);
            username.setBackgroundColor(Color.parseColor("#ff9999"));
            password.setBackgroundColor(Color.parseColor("#ff9999"));
            counter--;
//            username.setText(Integer.toString(counter));

            if (counter == 0)
            {
                login.setEnabled(false);
            }
        }

//


//        startActivity(intent);
    }
}

