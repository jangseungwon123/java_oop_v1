package com.access;

public class MainTest1 {

    public static void main(String[] args) {
        Bank bank1 = new Bank();// 인스턴스화
        //bank1.number; 이변수는 pravate이기에 외부에서 안보임
        //bank1.balance= 1000; 이 변수는 default 같은 패키지내에서 접근 가능
    }

}
