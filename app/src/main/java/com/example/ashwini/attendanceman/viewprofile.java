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

public class viewprofile extends SimpleActivity {
    DBhelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewprofile);
        mydb = new DBhelper(this);
        String YEAR = getIntent().getStringExtra("year");
        String BY = getIntent().getStringExtra("by");
        String INDEX = getIntent().getStringExtra("index");
        TextView year = $(R.id.year);
        Button next = $(R.id.next_student);
        year.setText(YEAR);
        Cursor res = mydb.getData1(getIntent().getStringExtra("year"),BY,INDEX);

        res.moveToNext();
        if (res.getCount() == 0) {
            // show message
            toast("Error, No Data found");
            finish();
        }
        else {
            if(res.getCount()==1)   next.setVisibility(View.GONE);
                setData(res);
            }
        }

    public void setData(Cursor res) {

        int count = 0, labcount = 0, total = 0, percent = 0;
        TextView name = $(R.id.name);
        TextView current = $(R.id.current);
        TextView sid = $(R.id.id);
        TextView email  = $(R.id.email);
        TextView contact = $(R.id.contact);
        TextView batch = $(R.id.batch);
        TextView lab_current = $(R.id.lab_current);
        TextView lab_current_per = $(R.id.lab_current_per);
        TextView current_per = $(R.id.current_per);


        sid.setText(res.getString(0));
        name.setText(res.getString(1));
        email.setText(res.getString(4));
        contact.setText(res.getString(3));
        batch.setText(res.getString(2));
        Cursor res1 = mydb.getData(getIntent().getStringExtra("year"),"All");
        Cursor res2 = mydb.getData(getIntent().getStringExtra("year"),batch.getText().toString());
        res1.moveToFirst();
        res2.moveToFirst();

        count = res1.getInt(5);
        //toast(count);
        if (count != 0) {
            for (int i = 1; i <= count; i++)
                total = total + res.getInt(i+6);
            percent = total * 100 / count;
            current.setText(""+total+"/"+count);
            current_per.setText("ATTENDANCE = " + percent + "%");
        } else current_per.setText("ATTENDANCE = " + "??%");


        labcount = res2.getInt(6);
        total=0;
        //toast(count);
        if (labcount != 0) {
            for (int i = 1; i <= labcount; i++)
                total = total + res.getInt(i+56);
            percent = total * 100 / labcount;
            lab_current.setText(""+total+"/"+labcount);
            lab_current_per.setText("ATTENDANCE = " + percent + "%");
        } else lab_current_per.setText("ATTENDANCE = " + "??%");

    }


    public void next_student(View view) {
        Cursor res = mydb.getData1(getIntent().getStringExtra("year"),getIntent().getStringExtra("by"),getIntent().getStringExtra("index"));
        TextView counter = $(R.id.count);
        int j = Integer.parseInt(counter.getText().toString());


        if (j>res.getCount()){
            toast("End of index");

        }
        else{
            res.move(j);
            j=j+1;
            setData(res);
            counter.setText(""+j);

        }



    }

    public void  edit(View view){
        TextView name = $(R.id.name);
        TextView sid = $(R.id.id);
        TextView batch = $(R.id.batch);
        TextView year = $(R.id.year);
        TextView contact = $(R.id.contact);
        TextView email  = $(R.id.email);

        Intent intent = new Intent(this, edit_profile.class);
        intent.putExtra("name", name.getText().toString());
        intent.putExtra("sid", sid.getText().toString());
        intent.putExtra("batch", batch.getText().toString());
        intent.putExtra("year", year.getText().toString());
        intent.putExtra("contact", contact.getText().toString());
        intent.putExtra("email", email.getText().toString());

        startActivity(intent);
        finish();

    }


}

