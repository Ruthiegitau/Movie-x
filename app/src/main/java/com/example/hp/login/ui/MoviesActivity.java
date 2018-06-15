package com.example.hp.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.hp.login.Fragments.ItemOneFragment;
import com.example.hp.login.R;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                startActivity(new Intent(MoviesActivity.this, ItemOneFragment.class));

                                break;

//                            case R.id.action_item2:
//                                selectedFragment = ItemTwoFragment.newInstance();
//                                startActivity(new Intent(MoviesActivity.this, ItemOneFragment.class));
//
//                                break;
//                            case R.id.action_item3:
//                                selectedFragment = ItemThreeFragment.newInstance();
//                                break;

                        }
//                        FragmentTransaction transaction =
//                                getSupportFragmentManager().beginTransaction();
//                        transaction.replace(R.id.frame_layout, selectedFragment);
//                        transaction.commit();
                        return true;
                    }
                });


    }
}