package com.example.mvp.demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
    }

    public void showInfo(String info){
        Toast.makeText(this,info,Toast.LENGTH_SHORT).show();
    }

    public abstract void setContentView();

    public abstract void init();

}
