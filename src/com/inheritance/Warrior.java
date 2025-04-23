package com.inheritance;

public class Warrior extends Hero{

    public Warrior(String name, int hp){
        //부모 사용자 정의 생성자가 있다면 super() 키워드를 사용햐서
        //가장 먼저 부모 생성자를 호출해야 한다.
        super(name, hp);
    }
    //부모의 메서드를 재저의 한다면 ---> 메서드 오버라이드

    //어노테이션 주석 + 힌트
    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다.");
        super.attack();

    }

    void comboAttack(){
        System.out.println("전사가 두번때립니다");

    }
}
