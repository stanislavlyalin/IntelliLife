//package com.intellilife.app;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class IntelliLifeDB extends SQLiteOpenHelper {
//
//    private static final String DB_NAME = "IntelliLife.db";
//    private static final int DB_VERSION = 1;
//
//    public IntelliLifeDB(Context context) {
//        super(context, DB_NAME, null, DB_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        // create goals table
//        String create_goals_table = "CREATE TABLE goals(\n" +
//                "  id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
//                "  name VARCHAR(100) NOT NULL,\n" +
//                "  total INTEGER NOT NULL,\n" +
//                "  progress INTEGER NOT NULL DEFAULT 0,\n" +
//                "  finish_date TIMESTAMP NOT NULL,\n" +
//                "  active BOOLEAN NOT NULL DEFAULT 1\n" +
//                ");";
//        db.execSQL(create_goals_table);
//
//        // create tasks table
//        String create_tasks_table = "CREATE TABLE tasks(\n" +
//                "  id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
//                "  goal_id INTEGER NOT NULL,\n" +
//                "  name VARCHAR(100) NOT NULL,\n" +
//                "  duration INTEGER NOT NULL DEFAULT 0,\n" +
//                "  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
//                "  finished BOOLEAN NOT NULL DEFAULT 0,\n" +
//                "  finish_date TIMESTAMP NOT NULL\n" +
//                ");";
//        db.execSQL(create_tasks_table);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int old_version, int new_version) {
//        //
//    }
//}
