package com.polymorphism;

public class Animal {

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eatting() {
        System.out.println("먹이를 먹습니다.");
    }

}// end of class

//상소관계로 설정- 다형성
class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    @Override
    public void eatting() {
        System.out.println("밥을 먹습니다.");
    }

    public void readBooks() {
        System.out.println("책을 읽습니다.");
    }
} //end of class

class Tiger extends Animal {

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걸어요.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
