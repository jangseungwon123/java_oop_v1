package com.mytest;

public class Basic_8 {

    public static void main(String[] args) {

        // 1. 은행 계좌에 잔액 변수 선언 및 초기화, 출력
        // 출력 결과
        // 현재 계좌 잔액: 7000원
        int basic = 7000;

        // 2. 고객 나이를 변수에 담기 (22)
        // 변수에 이름은 customerAge; 만들어 주세요
        // 출력 결과
        // 고객 나이: 22세
        int customerAge = 22;
        System.out.println("고객나이 : "  + customerAge);


        // 2.1 고객 나이를 28로 변경하고 원래 나이를 다른 변수에 저장해 주세요.
        // 주의 . 원래 있던 변수안에 값을 먼저 다른 변수에 저장을 해야 사라지지 않습니다.
        // 새로운 변수에 원래 있던 변수를 대입 연산하자.
        int age = customerAge;
        customerAge =28;
        //검증
        System.out.println(age);

        // 3. 두 변수를 변언을 하고 값을 교한해 보자.
        int age1 = customerAge;
        customerAge = age;
        System.out.println(customerAge);

        // 두 변수에 값을 교한을 하려면 어떤한 코드를 작성해야 할까?
        // 단 값으로 덮어쓰기 안됨

    } // end of main
} // end of class
