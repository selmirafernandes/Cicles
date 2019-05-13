package com.example.cicles;

import android.content.ContentValues;
import android.database.Cursor;

public class dataFim {

    private long id;
    private String DataF;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataF() {
        return DataF;
    }

    public void setDataF(String dataF) {
        DataF = dataF;
    }

    public ContentValues getContentValues() {
        ContentValues valores = new ContentValues();

        valores.put(BDtableFim.CAMPO_DATA_FIM, DataF);
        return valores;
    }

    public static dataFim fromCursor (Cursor cursor){
        long id = cursor.getLong(cursor.getColumnIndex(BDtableFim._ID));
        String data = cursor.getString(cursor.getColumnIndex(BDtableFim.CAMPO_DATA_FIM));

        dataFim dataFim = new dataFim();
        dataFim.setId(id);
        dataFim.setDataF(data);

        return dataFim;

    }
}
