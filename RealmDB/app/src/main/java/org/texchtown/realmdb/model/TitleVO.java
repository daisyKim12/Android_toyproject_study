package org.texchtown.realmdb.model;

import io.realm.RealmObject;

public class TitleVO extends RealmObject {
    private String title;
    private String message;

    public TitleVO() {
    }

    public TitleVO(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "TitleVO{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
