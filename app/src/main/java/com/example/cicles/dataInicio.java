package com.example.cicles;

import android.content.ContentValues;
import android.database.Cursor;

public class dataInicio {

    private long id;
    private String data;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ContentValues getContentValues() {
        ContentValues valores = new ContentValues();

        valores.put(BDtableInicio.CAMPO_DATA, data);
        return valores;
    }

    public static dataInicio fromCursor (Cursor cursor){
        long id = cursor.getLong(cursor.getColumnIndex(BDtableInicio._ID));
        String data = cursor.getString(cursor.getColumnIndex(BDtableInicio.CAMPO_DATA));

        dataInicio dataInicio = new dataInicio();
        dataInicio.setId(id);
        dataInicio.setData(data);

        return dataInicio;

    }
}
