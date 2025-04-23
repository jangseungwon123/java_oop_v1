package com.association;

public class Course {

    private String name;

    public Course(String name){
        this.name =name;
    }

    //getter메서드
    public String getName(){
        return  name;
    }

    public void display(){
        System.out.println("강의 :" + name);
    }
}
