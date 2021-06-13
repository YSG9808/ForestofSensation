package com.example.forestofsensation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Record_1_1 extends AppCompatActivity implements View.OnClickListener{

    FragmentManager manager;
    FragmentTransaction ft;

    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    FragmentThree fragmentThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_1_1);

        manager = getSupportFragmentManager();

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();
        fragmentThree = new FragmentThree();

        ft = manager.beginTransaction();
        ft.add(R.id.fragment_container, fragmentOne);
        ft.addToBackStack(null);
        ft.commit();

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ft = manager.beginTransaction();

        int id = v.getId();
        switch (id) {
            case R.id.one:
                ft.replace(R.id.fragment_container, fragmentOne);
                ft.commit();
                break;
            case R.id.two:
                ft.replace(R.id.fragment_container, fragmentTwo);
                ft.commit();
                break;
            case R.id.three:
                ft.replace(R.id.fragment_container, fragmentThree);
                ft.commit();
                break;
        }
    }
}



