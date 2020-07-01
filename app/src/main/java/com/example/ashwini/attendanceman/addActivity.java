package com.example.ashwini.attendanceman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import stanford.androidlib.SimpleActivity;

public class addActivity extends SimpleActivity {


    DBhelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        mydb=new DBhelper(this);

    }

    public void addstudent(View view) {

        EditText name = $(R.id.addname);
        EditText sid = $(R.id.addid);
        EditText email = $(R.id.addemail);
        EditText phone = $(R.id.addphone);
        RadioButton c1 = $(R.id.firstyear);
        RadioButton c2 = $(R.id.secondyear);
        RadioButton c3 = $(R.id.thirdyear);
        RadioButton c4 = $(R.id.fourthyear);
        RadioButton b1 = $(R.id.firstbatch);
        RadioButton b2 = $(R.id.secondbatch);
        RadioButton b3 = $(R.id.thirdbatch);
        RadioButton b4 = $(R.id.fourthbatch);

        int i = 0;
        String j="";
        if(c1.isChecked())  i =1;
        else if(c2.isChecked())  i=2;
        else if(c3.isChecked())  i=3;
        else if(c4.isChecked())  i=4;
        if(b1.isChecked())  j ="B1";
        else if(b2.isChecked())  j="B2";
        else if(b3.isChecked())  j="B3";
        else if(b4.isChecked())  j="B4";


        if (!name.getText().toString().equals("") && !sid.getText().toString().equals("") && !phone.getText().toString().equals("") && i!=0 && !j.equals("")){
            mydb.insertData(sid.getText().toString(),name.getText().toString(),j,i,phone.getText().toString(),email.getText().toString());
            toast("Student added");
            finish();
            //write code for database entry here
        }
        else {
            toast("Please fill all the details");
        }

    }
}
