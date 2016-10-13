package com.example.user.sqlite.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.sqlite.Config;

/**
 * Created by User on 08.10.2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

     private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME_PERSON = "myDB";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME_PERSON, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        final String SQL_CREATE_STORE_TABLE = "CREATE TABLE " + Contract.PersonEntry.TABLE_PERSON + " (" +

                Contract.PersonEntry._ID + " INTEGER PRIMARY KEY," +

                Contract.PersonEntry.COLUMN_PERSON_ID + " INTEGER, " +
                Contract.PersonEntry.COLUMN_PERSON_NAME + " TEXT, " +
                Contract.PersonEntry.COLUMN_PERSON_SURNAME + " TEXT, " +
                Contract.PersonEntry.COLUMN_PERSON_AGE + " INTEGER, " +
                ");";

        sqLiteDatabase.execSQL(SQL_CREATE_STORE_TABLE);

        sqLiteDatabase.execSQL(Config.COMMAND_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + Contract.PersonEntry.TABLE_PERSON);
        onCreate(sqLiteDatabase);
    }


}
