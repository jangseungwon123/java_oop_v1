package com.inheritance;

public class CMainTest1 {

    //코드의 진입점
    public static void main(String[] args) {

        //A, B, C
        //A와 C 관계는 상속 관계
        C c = new C();
        c.name = "C 클래스입니다";
        c.height = 20;
        c.weight = 100;
        c.age = 20;

        c.level= 1;
        c.nickName= " 자식 C클";

    }// end of main
}// end of class
