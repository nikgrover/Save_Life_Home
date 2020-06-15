package com.example.savelifehome;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_controller_view_tag);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_frag);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);


    }
}


