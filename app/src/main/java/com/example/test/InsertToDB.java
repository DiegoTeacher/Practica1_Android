package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InsertToDB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_to_db);// 1.0
    }

    public void changeToMain(View view) {
        Intent nIntent = new Intent(InsertToDB.this, MainActivity.class);
        startActivity(nIntent);
    }
}