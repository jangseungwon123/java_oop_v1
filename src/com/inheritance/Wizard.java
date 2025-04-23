package com.inheritance;

public class Wizard extends Hero{

    public Wizard(String name, int hp){
        super(name, hp);
    }

    void freezing(){
        System.out.println("마법사가 대상을 얼립니다");
    }

}
