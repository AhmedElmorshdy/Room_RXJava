package com.mmabas77.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = Model.class,version = 2)
public abstract class ModelDataBase extends RoomDatabase {

    private static ModelDataBase instance;
    public abstract ModelDao modelDao();

    public static synchronized ModelDataBase getInstance(Context context){

        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext()
                    ,ModelDataBase.class,"model_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
       return instance;
    }
}
