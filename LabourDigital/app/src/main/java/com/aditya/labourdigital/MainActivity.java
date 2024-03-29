package com.aditya.labourdigital;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.grey));

        db = FirebaseDatabase.getInstance().getReference("Nishant Rattan");

        db.setValue("Aditya Sharma");
    }

    public void loginme(View view){
        Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        Intent l = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(l);
    }


}