package com.example.cicles;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BDtableInicio implements BaseColumns {

    public  static  String NOME_TABELA = "Inicio";


    private SQLiteDatabase db;
    public BDtableInicio(SQLiteDatabase db) {
        this.db = db;
    }


    public void cria () {
        db.execSQL(
        "CREATE TABLE " + NOME_TABELA + "(" +
                _ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                "datas" + "TEXT NOT NULL " +
                ")"

        );
    }
}

