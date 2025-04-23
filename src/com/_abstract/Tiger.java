package com._abstract;
/**
추상클래스를 활용하는 이유
단하나로 추상메서드가 있으면 추상클래스가 되어야함
 */
public class Tiger extends  Animal{

    @Override
    public void hunt() {
        System.out.println("호랑이가 앞발로 사냥합니다.");
    }

    @Override
    public void move() {
        System.out.println("살금살금 조심히 이동합니다.");
    }
}// end of class
