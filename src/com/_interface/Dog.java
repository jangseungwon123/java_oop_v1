package com._interface;

//인테페이스는 구현받다. 구현하다.(상소이라는 말을 쓰지 않고)
//Animal이라는 인터페이스를 구현받다.
public class Dog implements Animal {

    //추상클래스를 구현 메서드로 재정의 해야함

    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹습니다.");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달린다.");
    }

    public static void main(String[] args) {
        
        //다형성
        Animal dog = new Dog();//업캐스팅
        Animal bird = new Bird();//업캐스팅

        dog.eat();
        dog.move();
        bird.eat();
        bird.move();
    }

}


class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("새가 먹이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 날아다닙니다.");
    }
}
