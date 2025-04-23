package com.polymorphism;

public class AnimalTest2 {

    public static void main(String[] args) {
        // 하나의 메서드가 여러 형태를 가질 수 있다.
        //move()--->
        //하나의 변수에 통으로 데이터르 관리하고 싶다면 ...자료구조(배열)
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Tiger();
        animals[2] = new Human();

        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }

    }// end of main
}//end of class
