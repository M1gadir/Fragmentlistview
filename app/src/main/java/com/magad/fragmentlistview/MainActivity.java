package com.magad.fragmentlistview;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.magad.fragmentlistview.fragment.bbbs;
import com.magad.fragmentlistview.fragment.listFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.wadah, new listFragment()).
                commit();

    }
}
