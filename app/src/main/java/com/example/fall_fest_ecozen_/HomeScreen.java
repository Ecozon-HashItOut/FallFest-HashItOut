package com.example.fall_fest_ecozen_;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class HomeScreen extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);

        drawerLayout.closeDrawer(GravityCompat.START);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = findViewById(R.id.navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new frag_home(), "homeTag").commit();
        navigationView.setCheckedItem(R.id.home);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.home:
                        drawerLayout.closeDrawer(GravityCompat.START);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new frag_home(), "homeTag").commit();
                        break;
                    case R.id.profile:
                    case R.id.wishlist:
                    case R.id.analytics:
                    case R.id.logout:

                }
                return true;
            }

        });
    }
}