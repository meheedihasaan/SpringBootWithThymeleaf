package com.example.springbootwiththymeleaf.models;

public class Student {

    private String name;
    private int age;
    private String address;

    public Student(){

    }

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

}
