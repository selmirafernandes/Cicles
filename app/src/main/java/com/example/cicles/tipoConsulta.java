package com.example.cicles;

import android.content.ContentValues;
import android.database.Cursor;

public class tipoConsulta {

    private long id;
    private String NomeC;
    private String data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeC() {
        return NomeC;
    }

    public void setNomeC(String nomeC) {
        NomeC = nomeC;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ContentValues getContentValues () {
        ContentValues valores = new ContentValues();

        valores.put(BDtipoConsulta.TIPO_CONSULTA, NomeC);
        valores.put(BDtipoConsulta.DATA_CONSULTA, data);

        return valores;
    }




    public static tipoConsulta fromCursor (Cursor cursor){
        long id = cursor.getLong(
                cursor.getColumnIndex(BDtipoConsulta._ID)
        );
         String NomeC = cursor.getString(
                 cursor.getColumnIndex(BDtipoConsulta.TIPO_CONSULTA)
         );

         String data = cursor.getString(cursor.getColumnIndex(BDtipoConsulta.DATA_CONSULTA));

        tipoConsulta tipoConsulta = new tipoConsulta();
        tipoConsulta.setId(id);
        tipoConsulta.setData(data);
        return tipoConsulta;
    }
}
