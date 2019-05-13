package com.example.cicles;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BDtableFim implements BaseColumns {

    public  static  String NOME_TABELA = "Fim";

    private SQLiteDatabase db;
    public BDtableFim(SQLiteDatabase db) {
        this.db = db;
    }

    public void cria () {
        db.execSQL(
                "CREATE TABLE " + NOME_TABELA + "(" +
                        _ID + "INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "dataf" + "TEXT NOT NULL " +
                        ")"

        );
    }
}
