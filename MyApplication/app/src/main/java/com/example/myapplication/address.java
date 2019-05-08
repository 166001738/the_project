package com.example.myapplication;
import  java.*;
import  java.io.*;
import  java.io.BufferedInputStream;
import  java.lang.String;
import  java.lang.*;
public class address {
    private  String name;
    private int imageID;
    private  String phone_number;
    public  address(String name,int imageID,String phone_number)
    {
        this.name=name;
        this.imageID=imageID;
        this.phone_number=phone_number;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
