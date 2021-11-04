package com.esenkubanychbekov.lesson_7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.esenkubanychbekov.lesson_7.databinding.ActivityMainBinding;
import com.esenkubanychbekov.lesson_7.fragments.CoinFragment;
import com.esenkubanychbekov.lesson_7.fragments.DateFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.container,new CoinFragment(),"tag").commit();
        binding.bottomNavView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CoinFragment(),"tag").commit();
                        break;
                    case R.id.favorite:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,new DateFragment(),"tag").commit();
                        break;
                }
                return true;
            }
        });

    }
}