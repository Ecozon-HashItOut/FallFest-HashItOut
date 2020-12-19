package com.example.fall_fest_ecozen_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.maps.SupportMapFragment;

public class Location extends AppCompatActivity {
    LocationManager locationManager;
    SupportMapFragment supportMapFragment;
    Button getd;
    String lati,longi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        Intent intent=getIntent();
        lati=intent.getStringExtra("lati");
        longi=intent.getStringExtra("longi");

    }
}