package com.example.savelifehome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void home(View view) {
    }

    public void Signup(View view) {
        Intent signup = new Intent(this, Signup.class);
        startActivity(signup);
    }
}