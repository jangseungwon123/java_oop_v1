package com._abstract;

public class MainTest1 {

    public static void main(String[] args) {
    //객체 지향 개념으로 animal이라는 클래쓰를 인스턴스화 시키면 쫌 오카시
        Animal animal;// 타입선언가능
       // animal = new Animal();<--오류발생
        //Amimal클래스는 abstract키워드를 붙혀 추상클래스로 설계함
        //그러면 추상 클래스는 new란 키워드 생성자를 활용해서
        //독립적으로 메모리에 올릴 수 없다.

        //Human human = new Human();;
        //개발자가 객체를생성 시킬 때 다른 사용자가 마음대로 생성하지 못하게 강제성을 지님


    }//end of main

}//end of class
