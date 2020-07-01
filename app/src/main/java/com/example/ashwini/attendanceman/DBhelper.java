package com.example.ashwini.attendanceman;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.util.Calendar;



/**
 * Created by Ashwini on 8/30/2017.
 */

public class DBhelper extends SQLiteOpenHelper  {
    public static final String database_name = "student.db";
    public static final String table_name1 = "student_table1";
    public static final String table_name2 = "student_table2";
    public static final String table_name3 = "student_table3";
    public static final String table_name4 = "student_table4";
    public static final String col1 = "ID";
    public static final String col2 = "NAME";
    public static final String col3 = "BATCH";
    public static final String col4 = "CONTACT";
    public static final String col5 = "EMAIL";





    public DBhelper(Context context) {
        super(context, database_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        /*String xxx1 = "create table " + table_name1 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT";
        String xxx2 = "create table " + table_name1 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT";
        String xxx3 = "create table " + table_name1 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT";
        String xxx4 = "create table " + table_name1 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT";
        for (int i=1;i<=50;i++){
            xxx1=xxx1+",Period"+i+" INTEGER NOT NULL  DEFAULT 0";
            xxx1=xxx1+",Period"+i+" INTEGER NOT NULL  DEFAULT 0";
            xxx1=xxx1+",Period"+i+" INTEGER NOT NULL  DEFAULT 0";
            xxx1=xxx1+",Period"+i+" INTEGER NOT NULL  DEFAULT 0";
        }

        xxx1=xxx1+")";
        xxx2=xxx2+")";
        xxx3=xxx3+")";
        xxx4=xxx4+")";
        db.execSQL(xxx1);
        db.execSQL(xxx2);
        db.execSQL(xxx3);
        db.execSQL(xxx4);
        create table  pass_table  (ID INTEGER PRIMARY KEY NOT NULL  DEFAULT 0,PASS TEXT NOT NULL DEFAULT '000000',QUESTION TEXT NOT NULL  DEFAULT 'What is the pass code?',ANSWER TEXT NOT NULL  DEFAULT '000000')

        */

        db.execSQL("create table " + table_name1 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT,COUNT INTEGER NOT NULL  DEFAULT 0,COUNTLAB INTEGER NOT NULL  DEFAULT 0,Period1 INTEGER NOT NULL  DEFAULT 0,Period2 INTEGER NOT NULL  DEFAULT 0,Period3 INTEGER NOT NULL  DEFAULT 0,Period4 INTEGER NOT NULL  DEFAULT 0,Period5 INTEGER NOT NULL  DEFAULT 0,Period6 INTEGER NOT NULL  DEFAULT 0,Period7 INTEGER NOT NULL  DEFAULT 0,Period8 INTEGER NOT NULL  DEFAULT 0,Period9 INTEGER NOT NULL  DEFAULT 0,Period10 INTEGER NOT NULL  DEFAULT 0,Period11 INTEGER NOT NULL  DEFAULT 0,Period12 INTEGER NOT NULL  DEFAULT 0,Period13 INTEGER NOT NULL  DEFAULT 0,Period14 INTEGER NOT NULL  DEFAULT 0,Period15 INTEGER NOT NULL  DEFAULT 0,Period16 INTEGER NOT NULL  DEFAULT 0,Period17 INTEGER NOT NULL  DEFAULT 0,Period18 INTEGER NOT NULL  DEFAULT 0,Period19 INTEGER NOT NULL  DEFAULT 0,Period20 INTEGER NOT NULL  DEFAULT 0,Period21 INTEGER NOT NULL  DEFAULT 0,Period22 INTEGER NOT NULL  DEFAULT 0,Period23 INTEGER NOT NULL  DEFAULT 0,Period24 INTEGER NOT NULL  DEFAULT 0,Period25 INTEGER NOT NULL  DEFAULT 0,Period26 INTEGER NOT NULL  DEFAULT 0,Period27 INTEGER NOT NULL  DEFAULT 0,Period28 INTEGER NOT NULL  DEFAULT 0,Period29 INTEGER NOT NULL  DEFAULT 0,Period30 INTEGER NOT NULL  DEFAULT 0,Period31 INTEGER NOT NULL  DEFAULT 0,Period32 INTEGER NOT NULL  DEFAULT 0,Period33 INTEGER NOT NULL  DEFAULT 0,Period34 INTEGER NOT NULL  DEFAULT 0,Period35 INTEGER NOT NULL  DEFAULT 0,Period36 INTEGER NOT NULL  DEFAULT 0,Period37 INTEGER NOT NULL  DEFAULT 0,Period38 INTEGER NOT NULL  DEFAULT 0,Period39 INTEGER NOT NULL  DEFAULT 0,Period40 INTEGER NOT NULL  DEFAULT 0,Period41 INTEGER NOT NULL  DEFAULT 0,Period42 INTEGER NOT NULL  DEFAULT 0,Period43 INTEGER NOT NULL  DEFAULT 0,Period44 INTEGER NOT NULL  DEFAULT 0,Period45 INTEGER NOT NULL  DEFAULT 0,Period46 INTEGER NOT NULL  DEFAULT 0,Period47 INTEGER NOT NULL  DEFAULT 0,Period48 INTEGER NOT NULL  DEFAULT 0,Period49 INTEGER NOT NULL  DEFAULT 0,Period50 INTEGER NOT NULL  DEFAULT 0,Lab1 INTEGER NOT NULL  DEFAULT 0,Lab2 INTEGER NOT NULL  DEFAULT 0,Lab3 INTEGER NOT NULL  DEFAULT 0,Lab4 INTEGER NOT NULL  DEFAULT 0,Lab5 INTEGER NOT NULL  DEFAULT 0,Lab6 INTEGER NOT NULL  DEFAULT 0,Lab7 INTEGER NOT NULL  DEFAULT 0,Lab8 INTEGER NOT NULL  DEFAULT 0,Lab9 INTEGER NOT NULL  DEFAULT 0,Lab10 INTEGER NOT NULL  DEFAULT 0,Lab11 INTEGER NOT NULL  DEFAULT 0,Lab12 INTEGER NOT NULL  DEFAULT 0,Lab13 INTEGER NOT NULL  DEFAULT 0,Lab14 INTEGER NOT NULL  DEFAULT 0,Lab15 INTEGER NOT NULL  DEFAULT 0,Lab16 INTEGER NOT NULL  DEFAULT 0,Lab17 INTEGER NOT NULL  DEFAULT 0,Lab18 INTEGER NOT NULL  DEFAULT 0,Lab19 INTEGER NOT NULL  DEFAULT 0,Lab20 INTEGER NOT NULL  DEFAULT 0,Lab21 INTEGER NOT NULL  DEFAULT 0,Lab22 INTEGER NOT NULL  DEFAULT 0,Lab23 INTEGER NOT NULL  DEFAULT 0,Lab24 INTEGER NOT NULL  DEFAULT 0,Lab25 INTEGER NOT NULL  DEFAULT 0,Lab26 INTEGER NOT NULL  DEFAULT 0,Lab27 INTEGER NOT NULL  DEFAULT 0,Lab28 INTEGER NOT NULL  DEFAULT 0,Lab29 INTEGER NOT NULL  DEFAULT 0,Lab30 INTEGER NOT NULL  DEFAULT 0)");
        db.execSQL("create table " + table_name2 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT,COUNT INTEGER NOT NULL  DEFAULT 0,COUNTLAB INTEGER NOT NULL  DEFAULT 0,Period1 INTEGER NOT NULL  DEFAULT 0,Period2 INTEGER NOT NULL  DEFAULT 0,Period3 INTEGER NOT NULL  DEFAULT 0,Period4 INTEGER NOT NULL  DEFAULT 0,Period5 INTEGER NOT NULL  DEFAULT 0,Period6 INTEGER NOT NULL  DEFAULT 0,Period7 INTEGER NOT NULL  DEFAULT 0,Period8 INTEGER NOT NULL  DEFAULT 0,Period9 INTEGER NOT NULL  DEFAULT 0,Period10 INTEGER NOT NULL  DEFAULT 0,Period11 INTEGER NOT NULL  DEFAULT 0,Period12 INTEGER NOT NULL  DEFAULT 0,Period13 INTEGER NOT NULL  DEFAULT 0,Period14 INTEGER NOT NULL  DEFAULT 0,Period15 INTEGER NOT NULL  DEFAULT 0,Period16 INTEGER NOT NULL  DEFAULT 0,Period17 INTEGER NOT NULL  DEFAULT 0,Period18 INTEGER NOT NULL  DEFAULT 0,Period19 INTEGER NOT NULL  DEFAULT 0,Period20 INTEGER NOT NULL  DEFAULT 0,Period21 INTEGER NOT NULL  DEFAULT 0,Period22 INTEGER NOT NULL  DEFAULT 0,Period23 INTEGER NOT NULL  DEFAULT 0,Period24 INTEGER NOT NULL  DEFAULT 0,Period25 INTEGER NOT NULL  DEFAULT 0,Period26 INTEGER NOT NULL  DEFAULT 0,Period27 INTEGER NOT NULL  DEFAULT 0,Period28 INTEGER NOT NULL  DEFAULT 0,Period29 INTEGER NOT NULL  DEFAULT 0,Period30 INTEGER NOT NULL  DEFAULT 0,Period31 INTEGER NOT NULL  DEFAULT 0,Period32 INTEGER NOT NULL  DEFAULT 0,Period33 INTEGER NOT NULL  DEFAULT 0,Period34 INTEGER NOT NULL  DEFAULT 0,Period35 INTEGER NOT NULL  DEFAULT 0,Period36 INTEGER NOT NULL  DEFAULT 0,Period37 INTEGER NOT NULL  DEFAULT 0,Period38 INTEGER NOT NULL  DEFAULT 0,Period39 INTEGER NOT NULL  DEFAULT 0,Period40 INTEGER NOT NULL  DEFAULT 0,Period41 INTEGER NOT NULL  DEFAULT 0,Period42 INTEGER NOT NULL  DEFAULT 0,Period43 INTEGER NOT NULL  DEFAULT 0,Period44 INTEGER NOT NULL  DEFAULT 0,Period45 INTEGER NOT NULL  DEFAULT 0,Period46 INTEGER NOT NULL  DEFAULT 0,Period47 INTEGER NOT NULL  DEFAULT 0,Period48 INTEGER NOT NULL  DEFAULT 0,Period49 INTEGER NOT NULL  DEFAULT 0,Period50 INTEGER NOT NULL  DEFAULT 0,Lab1 INTEGER NOT NULL  DEFAULT 0,Lab2 INTEGER NOT NULL  DEFAULT 0,Lab3 INTEGER NOT NULL  DEFAULT 0,Lab4 INTEGER NOT NULL  DEFAULT 0,Lab5 INTEGER NOT NULL  DEFAULT 0,Lab6 INTEGER NOT NULL  DEFAULT 0,Lab7 INTEGER NOT NULL  DEFAULT 0,Lab8 INTEGER NOT NULL  DEFAULT 0,Lab9 INTEGER NOT NULL  DEFAULT 0,Lab10 INTEGER NOT NULL  DEFAULT 0,Lab11 INTEGER NOT NULL  DEFAULT 0,Lab12 INTEGER NOT NULL  DEFAULT 0,Lab13 INTEGER NOT NULL  DEFAULT 0,Lab14 INTEGER NOT NULL  DEFAULT 0,Lab15 INTEGER NOT NULL  DEFAULT 0,Lab16 INTEGER NOT NULL  DEFAULT 0,Lab17 INTEGER NOT NULL  DEFAULT 0,Lab18 INTEGER NOT NULL  DEFAULT 0,Lab19 INTEGER NOT NULL  DEFAULT 0,Lab20 INTEGER NOT NULL  DEFAULT 0,Lab21 INTEGER NOT NULL  DEFAULT 0,Lab22 INTEGER NOT NULL  DEFAULT 0,Lab23 INTEGER NOT NULL  DEFAULT 0,Lab24 INTEGER NOT NULL  DEFAULT 0,Lab25 INTEGER NOT NULL  DEFAULT 0,Lab26 INTEGER NOT NULL  DEFAULT 0,Lab27 INTEGER NOT NULL  DEFAULT 0,Lab28 INTEGER NOT NULL  DEFAULT 0,Lab29 INTEGER NOT NULL  DEFAULT 0,Lab30 INTEGER NOT NULL  DEFAULT 0)");
        db.execSQL("create table " + table_name3 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT,COUNT INTEGER NOT NULL  DEFAULT 0,COUNTLAB INTEGER NOT NULL  DEFAULT 0,Period1 INTEGER NOT NULL  DEFAULT 0,Period2 INTEGER NOT NULL  DEFAULT 0,Period3 INTEGER NOT NULL  DEFAULT 0,Period4 INTEGER NOT NULL  DEFAULT 0,Period5 INTEGER NOT NULL  DEFAULT 0,Period6 INTEGER NOT NULL  DEFAULT 0,Period7 INTEGER NOT NULL  DEFAULT 0,Period8 INTEGER NOT NULL  DEFAULT 0,Period9 INTEGER NOT NULL  DEFAULT 0,Period10 INTEGER NOT NULL  DEFAULT 0,Period11 INTEGER NOT NULL  DEFAULT 0,Period12 INTEGER NOT NULL  DEFAULT 0,Period13 INTEGER NOT NULL  DEFAULT 0,Period14 INTEGER NOT NULL  DEFAULT 0,Period15 INTEGER NOT NULL  DEFAULT 0,Period16 INTEGER NOT NULL  DEFAULT 0,Period17 INTEGER NOT NULL  DEFAULT 0,Period18 INTEGER NOT NULL  DEFAULT 0,Period19 INTEGER NOT NULL  DEFAULT 0,Period20 INTEGER NOT NULL  DEFAULT 0,Period21 INTEGER NOT NULL  DEFAULT 0,Period22 INTEGER NOT NULL  DEFAULT 0,Period23 INTEGER NOT NULL  DEFAULT 0,Period24 INTEGER NOT NULL  DEFAULT 0,Period25 INTEGER NOT NULL  DEFAULT 0,Period26 INTEGER NOT NULL  DEFAULT 0,Period27 INTEGER NOT NULL  DEFAULT 0,Period28 INTEGER NOT NULL  DEFAULT 0,Period29 INTEGER NOT NULL  DEFAULT 0,Period30 INTEGER NOT NULL  DEFAULT 0,Period31 INTEGER NOT NULL  DEFAULT 0,Period32 INTEGER NOT NULL  DEFAULT 0,Period33 INTEGER NOT NULL  DEFAULT 0,Period34 INTEGER NOT NULL  DEFAULT 0,Period35 INTEGER NOT NULL  DEFAULT 0,Period36 INTEGER NOT NULL  DEFAULT 0,Period37 INTEGER NOT NULL  DEFAULT 0,Period38 INTEGER NOT NULL  DEFAULT 0,Period39 INTEGER NOT NULL  DEFAULT 0,Period40 INTEGER NOT NULL  DEFAULT 0,Period41 INTEGER NOT NULL  DEFAULT 0,Period42 INTEGER NOT NULL  DEFAULT 0,Period43 INTEGER NOT NULL  DEFAULT 0,Period44 INTEGER NOT NULL  DEFAULT 0,Period45 INTEGER NOT NULL  DEFAULT 0,Period46 INTEGER NOT NULL  DEFAULT 0,Period47 INTEGER NOT NULL  DEFAULT 0,Period48 INTEGER NOT NULL  DEFAULT 0,Period49 INTEGER NOT NULL  DEFAULT 0,Period50 INTEGER NOT NULL  DEFAULT 0,Lab1 INTEGER NOT NULL  DEFAULT 0,Lab2 INTEGER NOT NULL  DEFAULT 0,Lab3 INTEGER NOT NULL  DEFAULT 0,Lab4 INTEGER NOT NULL  DEFAULT 0,Lab5 INTEGER NOT NULL  DEFAULT 0,Lab6 INTEGER NOT NULL  DEFAULT 0,Lab7 INTEGER NOT NULL  DEFAULT 0,Lab8 INTEGER NOT NULL  DEFAULT 0,Lab9 INTEGER NOT NULL  DEFAULT 0,Lab10 INTEGER NOT NULL  DEFAULT 0,Lab11 INTEGER NOT NULL  DEFAULT 0,Lab12 INTEGER NOT NULL  DEFAULT 0,Lab13 INTEGER NOT NULL  DEFAULT 0,Lab14 INTEGER NOT NULL  DEFAULT 0,Lab15 INTEGER NOT NULL  DEFAULT 0,Lab16 INTEGER NOT NULL  DEFAULT 0,Lab17 INTEGER NOT NULL  DEFAULT 0,Lab18 INTEGER NOT NULL  DEFAULT 0,Lab19 INTEGER NOT NULL  DEFAULT 0,Lab20 INTEGER NOT NULL  DEFAULT 0,Lab21 INTEGER NOT NULL  DEFAULT 0,Lab22 INTEGER NOT NULL  DEFAULT 0,Lab23 INTEGER NOT NULL  DEFAULT 0,Lab24 INTEGER NOT NULL  DEFAULT 0,Lab25 INTEGER NOT NULL  DEFAULT 0,Lab26 INTEGER NOT NULL  DEFAULT 0,Lab27 INTEGER NOT NULL  DEFAULT 0,Lab28 INTEGER NOT NULL  DEFAULT 0,Lab29 INTEGER NOT NULL  DEFAULT 0,Lab30 INTEGER NOT NULL  DEFAULT 0)");
        db.execSQL("create table " + table_name4 +" (ID INTEGER PRIMARY KEY ,NAME TEXT,Batch TEXT,CONTACT TEXT,EMAIL TEXT,COUNT INTEGER NOT NULL  DEFAULT 0,COUNTLAB INTEGER NOT NULL  DEFAULT 0,Period1 INTEGER NOT NULL  DEFAULT 0,Period2 INTEGER NOT NULL  DEFAULT 0,Period3 INTEGER NOT NULL  DEFAULT 0,Period4 INTEGER NOT NULL  DEFAULT 0,Period5 INTEGER NOT NULL  DEFAULT 0,Period6 INTEGER NOT NULL  DEFAULT 0,Period7 INTEGER NOT NULL  DEFAULT 0,Period8 INTEGER NOT NULL  DEFAULT 0,Period9 INTEGER NOT NULL  DEFAULT 0,Period10 INTEGER NOT NULL  DEFAULT 0,Period11 INTEGER NOT NULL  DEFAULT 0,Period12 INTEGER NOT NULL  DEFAULT 0,Period13 INTEGER NOT NULL  DEFAULT 0,Period14 INTEGER NOT NULL  DEFAULT 0,Period15 INTEGER NOT NULL  DEFAULT 0,Period16 INTEGER NOT NULL  DEFAULT 0,Period17 INTEGER NOT NULL  DEFAULT 0,Period18 INTEGER NOT NULL  DEFAULT 0,Period19 INTEGER NOT NULL  DEFAULT 0,Period20 INTEGER NOT NULL  DEFAULT 0,Period21 INTEGER NOT NULL  DEFAULT 0,Period22 INTEGER NOT NULL  DEFAULT 0,Period23 INTEGER NOT NULL  DEFAULT 0,Period24 INTEGER NOT NULL  DEFAULT 0,Period25 INTEGER NOT NULL  DEFAULT 0,Period26 INTEGER NOT NULL  DEFAULT 0,Period27 INTEGER NOT NULL  DEFAULT 0,Period28 INTEGER NOT NULL  DEFAULT 0,Period29 INTEGER NOT NULL  DEFAULT 0,Period30 INTEGER NOT NULL  DEFAULT 0,Period31 INTEGER NOT NULL  DEFAULT 0,Period32 INTEGER NOT NULL  DEFAULT 0,Period33 INTEGER NOT NULL  DEFAULT 0,Period34 INTEGER NOT NULL  DEFAULT 0,Period35 INTEGER NOT NULL  DEFAULT 0,Period36 INTEGER NOT NULL  DEFAULT 0,Period37 INTEGER NOT NULL  DEFAULT 0,Period38 INTEGER NOT NULL  DEFAULT 0,Period39 INTEGER NOT NULL  DEFAULT 0,Period40 INTEGER NOT NULL  DEFAULT 0,Period41 INTEGER NOT NULL  DEFAULT 0,Period42 INTEGER NOT NULL  DEFAULT 0,Period43 INTEGER NOT NULL  DEFAULT 0,Period44 INTEGER NOT NULL  DEFAULT 0,Period45 INTEGER NOT NULL  DEFAULT 0,Period46 INTEGER NOT NULL  DEFAULT 0,Period47 INTEGER NOT NULL  DEFAULT 0,Period48 INTEGER NOT NULL  DEFAULT 0,Period49 INTEGER NOT NULL  DEFAULT 0,Period50 INTEGER NOT NULL  DEFAULT 0,Lab1 INTEGER NOT NULL  DEFAULT 0,Lab2 INTEGER NOT NULL  DEFAULT 0,Lab3 INTEGER NOT NULL  DEFAULT 0,Lab4 INTEGER NOT NULL  DEFAULT 0,Lab5 INTEGER NOT NULL  DEFAULT 0,Lab6 INTEGER NOT NULL  DEFAULT 0,Lab7 INTEGER NOT NULL  DEFAULT 0,Lab8 INTEGER NOT NULL  DEFAULT 0,Lab9 INTEGER NOT NULL  DEFAULT 0,Lab10 INTEGER NOT NULL  DEFAULT 0,Lab11 INTEGER NOT NULL  DEFAULT 0,Lab12 INTEGER NOT NULL  DEFAULT 0,Lab13 INTEGER NOT NULL  DEFAULT 0,Lab14 INTEGER NOT NULL  DEFAULT 0,Lab15 INTEGER NOT NULL  DEFAULT 0,Lab16 INTEGER NOT NULL  DEFAULT 0,Lab17 INTEGER NOT NULL  DEFAULT 0,Lab18 INTEGER NOT NULL  DEFAULT 0,Lab19 INTEGER NOT NULL  DEFAULT 0,Lab20 INTEGER NOT NULL  DEFAULT 0,Lab21 INTEGER NOT NULL  DEFAULT 0,Lab22 INTEGER NOT NULL  DEFAULT 0,Lab23 INTEGER NOT NULL  DEFAULT 0,Lab24 INTEGER NOT NULL  DEFAULT 0,Lab25 INTEGER NOT NULL  DEFAULT 0,Lab26 INTEGER NOT NULL  DEFAULT 0,Lab27 INTEGER NOT NULL  DEFAULT 0,Lab28 INTEGER NOT NULL  DEFAULT 0,Lab29 INTEGER NOT NULL  DEFAULT 0,Lab30 INTEGER NOT NULL  DEFAULT 0)");
        db.execSQL("create table IF NOT EXISTS " + "pass_table" +" (ID INTEGER PRIMARY KEY NOT NULL,PASS TEXT NOT NULL DEFAULT '000000',QUESTION TEXT NOT NULL  DEFAULT 'What is the pass code?',ANSWER TEXT NOT NULL  DEFAULT '000000')");

        /*for initial insertion in pass_table
        SQLiteDatabase db1 = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID",0);
        db.insert("pass_table",null ,contentValues);
        */


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name1);
        db.execSQL("DROP TABLE IF EXISTS "+ table_name2);
        db.execSQL("DROP TABLE IF EXISTS "+ table_name3);
        db.execSQL("DROP TABLE IF EXISTS "+ table_name4);
        onCreate(db);
    }


    public void addcolumn(String year,String period){


        //Create column name here

        Calendar now = Calendar.getInstance();
        int yeara = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        //select period according to current time

        String colnew = "x"+yeara+"_"+month+"_"+day+"_"+period;
        SQLiteDatabase db = this.getWritableDatabase();
        String exec;



        //Add column in table according to given year
        //

        if (year.equals("First Year")) {
            exec="ALTER TABLE "+ table_name1+" ADD COLUMN "+colnew+" INTEGER NOT NULL DEFAULT 0";
            db.execSQL(exec);

        }
        else if (year.equals("Second Year")) {
            db.execSQL("ALTER TABLE "+ table_name2+" ADD COLUMN "+colnew+" INTEGER NOT NULL  DEFAULT 0");

        }
        else if (year.equals("Third Year")) {
            db.execSQL("ALTER TABLE "+ table_name3+" ADD COLUMN "+colnew+" INTEGER NOT NULL  DEFAULT 0");

        }
        else if (year.equals("Fourth Year")) {
            db.execSQL("ALTER TABLE "+ table_name4+" ADD COLUMN "+colnew+" INTEGER NOT NULL  DEFAULT 0");

        }


    }


    public boolean insertData(String ID,String NAME,String BATCH,int YEAR,String CONTACT,String EMAIL) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        //for login

        if (YEAR==0){
            contentValues.put("ID",YEAR);
            db.insert("pass_table",null ,contentValues);
        }





        contentValues.put(col1,ID);
        contentValues.put(col2,NAME);
        contentValues.put(col3,BATCH);
        contentValues.put(col4,CONTACT);
        contentValues.put(col5,EMAIL);
        //contentValues.put("Period",0);
       /* String temp="";
        for (int i=1;i<=50;i++){
            temp="Period"+i;
            contentValues.put(temp,0);
            temp ="";
        }
        */
        long result=0;
        if (YEAR==1)
            result = db.insert(table_name1,null ,contentValues);
        else if (YEAR==2)
            result = db.insert(table_name2,null ,contentValues);
        else if (YEAR==3)
            result = db.insert(table_name3,null ,contentValues);
        else if (YEAR==4)
            result = db.insert(table_name4,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getData(String year,String batch) {
        SQLiteDatabase db = this.getWritableDatabase();

        //for login details
        if (year.equals("pass_table")){
            Cursor res = db.rawQuery("select * from " + year, null);
            return res;
        }

        //-----------------------------------------------------------------


        if (batch.equals("All")) {
            if (year.equals("First Year")) {
                Cursor res = db.rawQuery("select * from " + table_name1, null);
                return res;
            } else if (year.equals("Second Year")) {
                Cursor res = db.rawQuery("select * from " + table_name2, null);
                return res;
            } else if (year.equals("Third Year")) {
                Cursor res = db.rawQuery("select * from " + table_name3, null);
                return res;
            } else if (year.equals("Fourth Year")) {
                Cursor res = db.rawQuery("select * from " + table_name4, null);
                return res;
            }
        }
        else{
            if (year.equals("First Year")) {
                Cursor res = db.rawQuery("select * from " + table_name1+" WHERE Batch == '"+batch+"'", null);
                return res;
            }
            else if (year.equals("Second Year")) {
                Cursor res = db.rawQuery("select * from " + table_name2+" WHERE Batch == '"+batch+"'", null);
                return res;
            }
            else if (year.equals("Third Year")) {
                Cursor res = db.rawQuery("select * from " + table_name3+" WHERE Batch == '"+batch+"'", null);
                return res;
            }
            else if (year.equals("Fourth Year")) {
                Cursor res = db.rawQuery("select * from " + table_name4+" WHERE Batch == '"+batch+"'", null);
                return res;
            }
        }


        return null;
    }



    public Cursor getData1(String year,String by,String index) {
        SQLiteDatabase db = this.getWritableDatabase();

        if (year.equals("First Year")) {
            Cursor res = db.rawQuery("select * from " + table_name1+" WHERE "+by+" LIKE "+"'%"+index+"%'", null);
            return res;
        }
        else if (year.equals("Second Year")) {
            Cursor res = db.rawQuery("select * from " + table_name2+" WHERE "+by+" LIKE "+"'%"+index+"%'", null);
            return res;
        }
        else if (year.equals("Third Year")) {
            Cursor res = db.rawQuery("select * from " + table_name3+" WHERE "+by+" LIKE "+"'%"+index+"%'", null);
            return res;
        }
        else if (year.equals("Fourth Year")) {
            Cursor res = db.rawQuery("select * from " + table_name4+" WHERE "+by+" LIKE "+"'%"+index+"%'", null);
            return res;
        }


        return null;
    }




    public void addData(String ID,int data,String year,String colid) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1,ID);
        contentValues.put(colid,data);


        if (year.equals("First Year")) {
            db.update(table_name1, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Second Year")) {
            db.update(table_name2, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Third Year")) {
            db.update(table_name3, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Fourth Year")) {
            db.update(table_name4, contentValues, "ID = ?",new String[] { ID });

        }

    }


    public void addData1(String ID,String NAME,String BATCH,String CONTACT,String EMAIL,String year,String PERIOD,String LAB,int i,int j) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col1,ID);
        contentValues.put(col2,NAME);
        contentValues.put(col3,BATCH);
        contentValues.put(col4,CONTACT);
        contentValues.put(col5,EMAIL);
        if (!PERIOD.equals("")) contentValues.put(PERIOD,i);
        if (!LAB.equals("")) contentValues.put(LAB,j);


        if (year.equals("First Year")) {
            db.update(table_name1, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Second Year")) {
            db.update(table_name2, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Third Year")) {
            db.update(table_name3, contentValues, "ID = ?",new String[] { ID });

        }
        else if (year.equals("Fourth Year")) {
            db.update(table_name4, contentValues, "ID = ?",new String[] { ID });

        }

    }




    public void addData2(String ID,String PASSCODE,String QUES,String ANSW) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("ID",ID);
        if (!PASSCODE.equals("")) contentValues.put("PASS",PASSCODE);
        if (!QUES.equals("")) contentValues.put("QUESTION",QUES);
        if (!ANSW.equals("")) contentValues.put("ANSWER",ANSW);

        db.update("pass_table", contentValues, "ID = ?",new String[] { ID });
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(table_name1, "ID = ?",new String[] {id});
    }
}