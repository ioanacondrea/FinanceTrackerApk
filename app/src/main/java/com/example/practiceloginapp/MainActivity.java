package com.example.practiceloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private TextView result;
    private Snackbar okSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = findViewById(R.id.usernameInputField);
        password = findViewById(R.id.passwordInputField);
        login = findViewById(R.id.logInButton);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                View parentLayout = findViewById(android.R.id.content);
                if(username.getText().toString().equals("ioana") && password.getText().toString().equals("123qwe")){
                    okSnackbar = Snackbar.make(parentLayout, "Logged in!", Snackbar.LENGTH_SHORT);
                    okSnackbar.show();
                }
                else {
                    okSnackbar = Snackbar.make(parentLayout, "Try again!", Snackbar.LENGTH_SHORT);
                    okSnackbar.show();
                }

            }
        });
    }
}
