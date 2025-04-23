package com._abstract;

/**
 * 추상 클래스란? (abstract)
 * 하나 이상의  추상메서드를 포함하는 클래스 이거나
 * class 키워드앞에 abstract 가지고 있으면 추상 클래스이다.
 */
//강제적으로 타입으로만 설꼐하는 기법을 말함
// abstract - 강제성
public abstract class Animal {

    String name;

    public void move(){
        System.out.println("이동합니다");
    }

    //추상메서드 만들어보자
    //클래스 내에 단 하나라도 추상메서드를 가진다면
    //그 클래스는 반드시 추상클래스가 되어야함
    public abstract void hunt();


}
