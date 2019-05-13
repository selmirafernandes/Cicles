package com.example.cicles;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

public class BdCiclesOpenHelper extends SQLiteOpenHelper {


    public static final String Data_base_name = "data_base";
    public static final int VERSION_BD_1 = 1;

    public BdCiclesOpenHelper(@NonNull Context context, @NonNull String name, @NonNull SQLiteDatabase.CursorFactory factory, int version) {
        super(context, Data_base_name, null, VERSION_BD_1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        new BDtipoConsulta(db).cria();
        new BDtableInicio(db).cria();
        new BDtableFim(db).cria();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
