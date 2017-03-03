package com.example.jonat.campfire;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import backend.database.DatabaseAdapter;

public class HelpActivity extends AppCompatActivity {

    DatabaseAdapter db;
    private String uEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        setTitle("Help");

        Intent intent = getIntent();
        uEmail = intent.getExtras().getString("userEmail");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home){
            Intent mainIntent = new Intent(this, MainActivity.class);
            mainIntent.putExtra("userEmail", uEmail);
            startActivity(mainIntent);
            return true;
        }
        return false;
    }
}
