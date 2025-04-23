package com.inheritance;

public class MainTest1 {

    public static void main(String[] args) {

        // Cal 클래스와 ChildCal 관계는 부모 자식 관계에 놓여 있다.
        ChildCal childCal = new ChildCal();
        int sum1 = childCal.sum(10 ,10);
        System.out.println("sum1 : " + sum1);

        int minus1 = childCal.minus(10,3);
        System.out.println("minus1 :" + minus1);

        //곱
        //부모 클래스의 메서드를 자식 클래스에서 재정의 한다면
        //메서드 오버라이드
        int multi = childCal.multiply(3,0);
        System.out.println("muiti : " + multi);

        //상속관계에 있어 부모 클래스가 먼저 존재해야
        //자식클래스가 존재가능

    }//end of main
}// end of class
