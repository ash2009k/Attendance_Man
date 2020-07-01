package com.example.ashwini.attendanceman;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import stanford.androidlib.SimpleActivity;

public class security_question extends SimpleActivity {
    DBhelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_question);
        mydb=new DBhelper(this);
        Cursor res = mydb.getData("pass_table","");
        res.moveToFirst();
        TextView ques = $(R.id.question);
        ques.setText(res.getString(2));
    }

    public void submitter(View view) {
        Cursor res = mydb.getData("pass_table","");
        res.moveToFirst();
        TextView ques = $(R.id.question);
        TextView ins = $(R.id.title_tv);
        EditText answ = $(R.id.answer);
        EditText new_pass = $(R.id.new_passcode);
        Button submit_b = $(R.id.submit);
        Button update_b = $(R.id.update_pass_button);
        if (answ.getText().toString().equals(res.getString(3))){
            ques.setVisibility(View.GONE);
            ins.setText("ENTER NEW PASSCODE");
            answ.setText("");
            answ.setVisibility(View.GONE);
            new_pass.setVisibility(View.VISIBLE);
            submit_b.setVisibility(View.GONE);
            update_b.setVisibility(View.VISIBLE);
        }
        else toast("Wrong answer");
    }


    public void update_passcode(View view) {
        EditText new_pass = $(R.id.new_passcode);
        if (!new_pass.getText().toString().equals("")) {
            mydb.addData2("0", new_pass.getText().toString(), "", "");
            finish();
        }
        else toast("please enter new passcode");
    }

    /*public void cky(View view) {
        mydb.addcolumn("First Year","Period10");
    }*/
}
