package com.example.rawal.listviewpractice;

import java.io.Serializable;

public class User implements Serializable {

    public int image;
    public int age;
    public String name;
    public String TVSeries;


    public User(){

    }

    public User(String name,int age){
        this.name=name;
        this.age=age;
    }

    public User(int image,String name,String TVSeries){
        this.image=image;
        this.name=name;
        this.TVSeries=TVSeries;
    }
}
