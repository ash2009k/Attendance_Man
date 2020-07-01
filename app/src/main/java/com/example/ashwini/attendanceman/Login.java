package com.example.ashwini.attendanceman;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import stanford.androidlib.SimpleActivity;

public class Login extends SimpleActivity {
    DBhelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mydb=new DBhelper(this);
        Cursor res = mydb.getData("pass_table","");
        if (res.getCount()== 0){
            mydb.insertData("","","",0,"","");
        }

    }

    public void forgot_passcode(View view) {
        Intent intent = new Intent(this, security_question.class);
        startActivity(intent);

    }

    public void validate(View view) {
        EditText passcode = $(R.id.passcode);
        Cursor res = mydb.getData("pass_table","");
        res.moveToFirst();
        if(passcode.getText().toString().equals(res.getString(1))){
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
        else    toast("Wrong PASSCODE");
    }
}
