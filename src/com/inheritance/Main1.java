package com.inheritance;

class Animal {
    //자식 클래스에서 접근 가능함//자시막 사용가능하게끔
    protected String name;

    void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }

    void bark() {
        System.out.println(name + "이(가)  짖습니다");
    }
}

//자식 클래스
class Dog extends Animal {

    @Override
    void eat() {
        super.eat();
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        //고양이의 먹는 모습 구현
        //super.eat();
    }
}

//xxx.java 단하나의 자바파일에는 pubulic 가진 클래스느는 오직 하나만 존재가능
public class Main1 {


    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "바둑이";

        dog.eat();
        dog.bark();

    }//end of main
}// end of class
