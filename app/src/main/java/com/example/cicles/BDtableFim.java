package com.example.cicles;

import android.content.ContentValues;
import android.database.Cursor;
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
