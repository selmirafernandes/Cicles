package com.example.cicles;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class BDtipoConsulta implements BaseColumns {

    public  static final String NOME_TABELA = "nome";
    public static final String TIPO_CONSULTA = "tipo consulta";
    public static final String DATA_CONSULTA = "Data Consulta";


    private SQLiteDatabase db;
    public BDtipoConsulta (SQLiteDatabase db) { this.db = db;}

    private void cria() {
        db.execSQL(
                "CREATE TABLE " + NOME_TABELA + "(" +
                    _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        TIPO_CONSULTA + "TEXT NOT NULL," +
                        DATA_CONSULTA +
                        ")"
        );

    }
}
