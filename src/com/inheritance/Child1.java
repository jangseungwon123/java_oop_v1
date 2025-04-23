package com.inheritance;

public class Child1 extends Super1{

    int age;

    //상속 관계에 있어서
    //부모가 존재해야 자식이 존재 가능
    public Child1(String name, int age){
        super(name);
        this.age = age;
    }
}
