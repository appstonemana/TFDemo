package com.mb.tfdemo;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {
    @PrimaryKey
    public int id;
    public byte[] face;

    public User() {
    }

    public User(int id, byte[] face) {
        this.id = id;
        this.face = face;
    }
}
