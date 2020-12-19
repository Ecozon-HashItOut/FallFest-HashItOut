package com.example.fall_fest_ecozen_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ListofShops extends AppCompatActivity {
    Button save;
    ConstraintLayout cl1,cl2,cl3;
    TextView text;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_shops);
        save=findViewById(R.id.button);
        text=findViewById(R.id.text);
        cl1=findViewById(R.id.constraintLayout);
        cl2=findViewById(R.id.constraintLayout2);
        cl3=findViewById(R.id.constraintLayout3);
        text.setText("Disclaimer \nThere might be variation in availability of products. This information is solely provided by the local shop owner");
        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListofShops.this,Location.class);
                String lat="13.0827";
                String log="80.2707";
                intent.putExtra("lati",lat);
                intent.putExtra("longi",log);
                startActivity(intent);
            }
        });
        cl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListofShops.this,Location.class);
                String lat="13.0835";
                String log="80.2702";
                intent.putExtra("lati",lat);
                intent.putExtra("longi",log);
                startActivity(intent);
            }
        });
        cl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ListofShops.this,Location.class);
                String lat="13.0825";
                String log="80.2709";
                intent.putExtra("lati",lat);
                intent.putExtra("longi",log);
                startActivity(intent);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
            }
        });
    }
}