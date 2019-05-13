package com.example.cicles;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BDtableInicio implements BaseColumns {

    public static final String CAMPO_DATA = "datas";
    public  static  String NOME_TABELA = "Inicio";


    private SQLiteDatabase db;
    public BDtableInicio(SQLiteDatabase db) {
        this.db = db;
    }


    public void cria () {
        db.execSQL(
        "CREATE TABLE " + NOME_TABELA + "(" +
                _ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                CAMPO_DATA + "TEXT NOT NULL " +
                ")"

        );
    }

    public Cursor query(String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) {
        return db.query(NOME_TABELA, columns, selection, selectionArgs, groupBy, having, orderBy);
    }

    public long insert(ContentValues values) {
        return db.insert(NOME_TABELA, null, values);
    }

    public int update(ContentValues values, String whereClause, String [] whereArgs) {
        return db.update(NOME_TABELA, values, whereClause, whereArgs);
    }

    public int delete (String whereClause, String[] whereArgs) {
        return db.delete(NOME_TABELA, whereClause, whereArgs);
    }
}

