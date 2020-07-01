package com.example.ashwini.attendanceman;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import stanford.androidlib.SimpleActivity;

public class editActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    public void proceed_to_Edit(View view) {

        RadioButton c1 = $(R.id.firstyear);
        RadioButton c2 = $(R.id.secondyear);
        RadioButton c3 = $(R.id.thirdyear);
        RadioButton c4 = $(R.id.fourthyear);
        RadioButton b1 = $(R.id.by_name);
        RadioButton b2 = $(R.id.by_id);
        EditText e = $(R.id.index);

        String i = "";
        String j="";
        String k = e.getText().toString();
        if(c1.isChecked())  i ="First Year";
        else if(c2.isChecked())  i ="Second Year";
        else if(c3.isChecked())  i ="Third Year";
        else if(c4.isChecked())  i ="Fourth Year";
        if(b1.isChecked())  j ="NAME";
        else if(b2.isChecked())  j="ID";

        if (!i.equals("")&&(!j.equals(""))&&(!k.equals(""))) {
            Intent intent = new Intent(this, viewprofile.class);
            intent.putExtra("year", i);
            intent.putExtra("by", j);
            intent.putExtra("index", k);
            startActivity(intent);
            //finish();
        }
        else    toast("Please Enter all Fields");
    }
}

