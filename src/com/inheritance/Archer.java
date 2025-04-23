package com.inheritance;

public class Archer extends Hero{

    public Archer(String name, int hp){
        super(name, hp);
    }

    void fireArrow(){
        System.out.println("궁사가 불화살을 쏩니다");

    }

}
