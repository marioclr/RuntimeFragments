package com.mclr.mini.runtimefragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentoUno mFragmentoUno;
    FragmentoDos mFragmentoDos;
    int mostrandoFragment =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentoUno = new FragmentoUno();
        mFragmentoDos = new FragmentoDos();
        FragmentManager fragmentManager =
                getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout, mFragmentoUno);
        fragmentTransaction.commit();
        mostrandoFragment =1;
    }

    public void cambiarFragmento(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (mostrandoFragment ==1) {
            fragmentTransaction.replace(R.id.frameLayout, mFragmentoDos);
            mostrandoFragment = 2;
        } else {
            fragmentTransaction.replace(R.id.frameLayout, mFragmentoUno);
            mostrandoFragment =1;
        }
        fragmentTransaction.commit();
    }
}
