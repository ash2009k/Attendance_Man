package com.example.ashwini.attendanceman;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import stanford.androidlib.SimpleActivity;

public class takeatttendance1 extends SimpleActivity {
    DBhelper mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeatttendance1);
        mydb = new DBhelper(this);
        String YEAR = getIntent().getStringExtra("year");
        String BATCH = getIntent().getStringExtra("batch");
        TextView year = $(R.id.year);
        TextView batch = $(R.id.batch);
        year.setText(YEAR);
        batch.setText(BATCH);


        Cursor res = mydb.getData(getIntent().getStringExtra("year"), getIntent().getStringExtra("batch"));

        res.moveToNext();
        if (res.getCount() == 0) {
            // show message
            toast("Error, Nothing found");
            toast("Please Add Students");
            finish();
        } else {
            if (BATCH.equals("All")){
                int s=res.getInt(5);
                //toast(s);
                s=s+1;
                mydb.addData(res.getString(0),s,YEAR,"COUNT");
                setData(res);
            }
            else{
                int s=res.getInt(6);
                //toast(s);
                s=s+1;
                mydb.addData(res.getString(0),s,YEAR,"COUNTLAB");
                setData(res);
            }
        }

    }

    public void setData(Cursor res) {

        int count = 0, total = 0, percent = 0;
        TextView name = $(R.id.name);
        TextView current = $(R.id.current);
        TextView sid = $(R.id.id);
        TextView percentattendance = $(R.id.percentattendance);

        sid.setText(res.getString(0));
        name.setText(res.getString(1));
        Cursor res1 = mydb.getData(getIntent().getStringExtra("year"),"All");
        Cursor res2 = mydb.getData(getIntent().getStringExtra("year"),getIntent().getStringExtra("batch"));
        res1.moveToFirst();
        res2.moveToFirst();
        if (getIntent().getStringExtra("batch").equals("All")){
            count = res1.getInt(5);
            if (count != 0) {
                for (int i = 1; i <= count; i++)
                    total = total + res.getInt(i+6);
                percent = total * 100 / count;
                current.setText(""+total+"/"+count);
                percentattendance.setText("ATTENDANCE = " + percent + "%");
            } else percentattendance.setText("ATTENDANCE = " + "??%");
        }
        else {
            count = res2.getInt(6);
            if (count != 0) {
                for (int i = 1; i <= count; i++)
                    total = total + res.getInt(i+56);
                percent = total * 100 / count;
                current.setText(""+total+"/"+count);
                percentattendance.setText("ATTENDANCE = " + percent + "%");
            } else percentattendance.setText("ATTENDANCE = " + "??%");
        }



    }


    public void setabsentbutton(View view) {
        Cursor res = mydb.getData(getIntent().getStringExtra("year"),getIntent().getStringExtra("batch"));
        TextView counter = $(R.id.count);
        TextView sid = $(R.id.id);
        int j = Integer.parseInt(counter.getText().toString());



        if (getIntent().getStringExtra("batch").equals("All")){
            res.moveToNext();
            int s=res.getInt(5);
            mydb.addData(sid.getText().toString(),0,getIntent().getStringExtra("year"),"period"+s);
            res.moveToPrevious();
        }
        else {
            res.moveToNext();
            int s=res.getInt(6);
            mydb.addData(sid.getText().toString(),0,getIntent().getStringExtra("year"),"Lab"+s);
            res.moveToPrevious();
        }


        //store attendance data




        if (j>res.getCount()){
            finish();
            toast("Attendance Finished ");

        }
        else{
            res.move(j);
            j=j+1;
            setData(res);
            counter.setText(""+j);

        }

    }

    public void setpresentbutton(View view) {

        Cursor res = mydb.getData(getIntent().getStringExtra("year"),getIntent().getStringExtra("batch"));
        TextView counter = $(R.id.count);
        TextView sid = $(R.id.id);
        int j = Integer.parseInt(counter.getText().toString());

        if (getIntent().getStringExtra("batch").equals("All")){
            res.moveToNext();
            int s=res.getInt(5);
            mydb.addData(sid.getText().toString(),1,getIntent().getStringExtra("year"),"period"+s);
            res.moveToPrevious();
        }
        else {
            res.moveToNext();
            int s=res.getInt(6);
            mydb.addData(sid.getText().toString(),1,getIntent().getStringExtra("year"),"Lab"+s);
            res.moveToPrevious();
        }


        //store attendance data




        if (j>res.getCount()){
            finish();
            toast("Attendance Finished ");

        }
        else{
            res.move(j);
            j=j+1;
            setData(res);
            counter.setText(""+j);

        }

    }


}
