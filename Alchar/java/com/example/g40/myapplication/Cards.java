package com.example.g40.myapplication;

public class Cards {
    private String user;
    private String imgURL;
    private String keterangan;

    public Cards(String user, String imgURL, String keterangan) {
        this.user = user;
        this.imgURL = imgURL;
        this.keterangan = keterangan;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
