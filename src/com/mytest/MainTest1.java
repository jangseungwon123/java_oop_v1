package com.mytest;

import com.access.Bank;

public class MainTest1 {

    public static void main(String[] args) {
        Bank bank2 = new Bank();
        // 이 bank는 패키지 access에 존재하는 녀석이다.
        //현재 우리 패키지는 mytest에 존재하고 있다.
        //bank2.balance = 10; //balance변수는 접근 제어 지시자가 default 이기 때문에 접근 안됨
        bank2.name = "홍길동"; // public은 어디서나 접근 가능
    }
}
