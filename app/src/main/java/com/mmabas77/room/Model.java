package com.mmabas77.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "model_table")
public class Model {
    @PrimaryKey(autoGenerate = true)
    int id;
    String title;
    String body;

    public Model(String title, String body) {

        this.title = title;
        this.body = body;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
