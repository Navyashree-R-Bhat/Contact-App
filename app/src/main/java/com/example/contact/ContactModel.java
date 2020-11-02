package com.example.contact;

public class ContactModel {
    String name, gmail, phno;
    int imageResId=0;

    public ContactModel(String cname, String cgmail, String cphno, int cImageResId){
        this.name=cname;
        this.gmail=cgmail;
        this.phno=cphno;
        this.imageResId=cImageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
