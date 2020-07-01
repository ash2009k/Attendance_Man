package com.example.ashwini.attendanceman;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import stanford.androidlib.SimpleActivity;

public class edit_profile extends SimpleActivity {
    DBhelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        mydb = new DBhelper(this);
        EditText name = $(R.id.name);
        TextView sid = $(R.id.id);
        EditText batch = $(R.id.batch);
        EditText contact = $(R.id.contact);
        EditText email  = $(R.id.email);
        TextView year = $(R.id.year);
        name.setText(getIntent().getStringExtra("name"));
        sid.setText(getIntent().getStringExtra("sid"));
        batch.setText(getIntent().getStringExtra("batch"));
        year.setText(getIntent().getStringExtra("year"));
        contact.setText(getIntent().getStringExtra("contact"));
        email.setText(getIntent().getStringExtra("email"));

    }

    public void  update(View view){
        EditText name = $(R.id.name);
        TextView sid = $(R.id.id);
        EditText batch = $(R.id.batch);
        TextView year = $(R.id.year);
        EditText contact = $(R.id.contact);
        EditText email  = $(R.id.email);
        EditText period = $(R.id.period);
        EditText lab = $(R.id.lab);
        RadioButton add_period = $(R.id.add_period);
        RadioButton remove_period = $(R.id.remove_period);
        RadioButton add_lab = $(R.id.add_lab);
        RadioButton remove_lab = $(R.id.remove_lab);

        int i=0,j=0;
        if(add_period.isChecked())  i=1;
        else if (remove_period.isChecked()) i=0;
        if(add_lab.isChecked())  j=1;
        else if (remove_lab.isChecked()) j=0;

        mydb.addData1(sid.getText().toString(),name.getText().toString(),batch.getText().toString(),contact.getText().toString(),email.getText().toString(),year.getText().toString(),period.getText().toString(),lab.getText().toString(),i,j);
        toast("Student Updated");
        finish();



    }


    public void delete_student(View view) {
        TextView sid = $(R.id.id);
        mydb.deleteData(sid.getText().toString());
        toast("Student Deleted");
        finish();
    }
}
