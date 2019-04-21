package com.example.fragmentnew;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLoadFragment;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadFragment = findViewById(R.id.btnLoadFragment);
        btnLoadFragment.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (status){

            FirstFragment ff = new FirstFragment();
            ft.replace(R.id.fragmentContainer,ff);
            ft.addToBackStack(null);
            ft.commit();
            btnLoadFragment.setText("Find Area of Circle");
            status = false;


        }else{

            SecondFragment sf = new SecondFragment();
            ft.replace(R.id.fragmentContainer,sf);
            ft.addToBackStack(null);
            ft.commit();
            btnLoadFragment.setText("Find Sum");
            status = true;

        }

    }
}
