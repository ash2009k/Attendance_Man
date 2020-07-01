package com.example.ashwini.attendanceman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import stanford.androidlib.SimpleActivity;

public class HomeActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void take(View view) {
        Intent intent =new Intent(this,attendanceActivity.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent =new Intent(this,addActivity.class);
        startActivity(intent);
    }

    public void edit(View view) {
        Intent intent =new Intent(this,editActivity.class);
        startActivity(intent);
    }

    public void edit_pass(View view) {
        Intent intent =new Intent(this,edit_pass.class);
        startActivity(intent);
    }

}
