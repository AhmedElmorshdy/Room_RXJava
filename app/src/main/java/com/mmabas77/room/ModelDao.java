package com.mmabas77.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;

@Dao
public interface ModelDao {
    @Insert
    Completable insertData(Model model);

    @Query("select * from model_table")
     Single<List<Model>>getList();
}
