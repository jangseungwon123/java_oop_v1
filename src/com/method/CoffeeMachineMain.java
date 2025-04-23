package com.method;

public class CoffeeMachineMain {
    public static void main(String[] args) {

        //커피 머신 객체 생성 -> 인스턴스 화 -->인스터스(객체)
       CoffeeMachine machine1 = new CoffeeMachine(100,10);
       // CoffeeMachine machine = new CoffeeMachine(100,10);

       //재려 채우기 동작을 시켜 보자(물, 원두)
        machine1.refilWater(200);
        machine1.refillCoffee(30);
        System.out.println("-----------------------");

        // 커피 만들기 테스트
        System.out.println("커피 주문");
       String result = machine1.makeCoffee();
        System.out.println(result);
        // 또 커피 주문
        System.out.println(" 또 커피 주문!");
        System.out.println(machine1.makeCoffee());

        // 또 커피 주문(재료 부족 테스트)
        System.out.println(" 마지막 커피 주문!");
        System.out.println(machine1.makeCoffee());

        //재료량 확인
        machine1.showInfo();

    }//emd of main
}
