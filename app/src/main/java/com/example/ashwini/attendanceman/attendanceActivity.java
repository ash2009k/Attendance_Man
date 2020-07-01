package com.example.ashwini.attendanceman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

import stanford.androidlib.SimpleActivity;

public class attendanceActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);


        /*Spinner spinner = $(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.periods_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);*/

    }


    public void proceed_to_attendance(View view) {

        RadioButton c1 = $(R.id.firstyear);
        RadioButton c2 = $(R.id.secondyear);
        RadioButton c3 = $(R.id.thirdyear);
        RadioButton c4 = $(R.id.fourthyear);
        RadioButton b1 = $(R.id.firstbatch);
        RadioButton b2 = $(R.id.secondbatch);
        RadioButton b3 = $(R.id.thirdbatch);
        RadioButton b4 = $(R.id.fourthbatch);
        /*Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);*/




        String i = "";
        String j="All";
        if(c1.isChecked())  i ="First Year";
        else if(c2.isChecked())  i ="Second Year";
        else if(c3.isChecked())  i ="Third Year";
        else if(c4.isChecked())  i ="Fourth Year";
        if(b1.isChecked())  j ="B1";
        else if(b2.isChecked())  j="B2";
        else if(b3.isChecked())  j="B3";
        else if(b4.isChecked())  j="B4";
        //toast(spinner.getSelectedItem().toString());


        if (!i.equals("")) {
            Intent intent = new Intent(this, takeatttendance1.class);
            intent.putExtra("year", i);
            intent.putExtra("batch", j);
            //intent.putExtra("period", spinner.getSelectedItem().toString());
            toast("Take Attendance");
            startActivity(intent);
            //finish();
        }
        else    toast("Please Select Year");
    }
}
