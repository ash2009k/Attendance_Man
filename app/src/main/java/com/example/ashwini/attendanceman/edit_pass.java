package com.example.ashwini.attendanceman;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import stanford.androidlib.SimpleActivity;

public class edit_pass extends SimpleActivity {
    DBhelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pass);
        mydb=new DBhelper(this);
        Cursor res = mydb.getData("pass_table","");
        res.moveToFirst();
        EditText ques = $(R.id.question);
        EditText answ = $(R.id.answer);
        ques.setText(res.getString(2));
        answ.setText(res.getString(3));

    }

    public void submit_pass_details(View view) {
        EditText ques = $(R.id.question);
        EditText answ = $(R.id.answer);
        EditText new_p = $(R.id.new_passcode);
        EditText old_p = $(R.id.old_passcode);
        Cursor res = mydb.getData("pass_table","");
        res.moveToFirst();
        if (res.getString(1).equals(old_p.getText().toString())){
            mydb.addData2("0", new_p.getText().toString(), ques.getText().toString(), answ.getText().toString());
            toast("passcode details updated");
            finish();
        }
        else toast("Please enter correct passcode");
    }
}
