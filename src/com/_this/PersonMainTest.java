package com._this;

public class PersonMainTest {

    public static void main(String[] args) {
       // Person p1 = new Person("홍길동",10,"010-1234-1234");
        Person p1 = new Person("홍길동",10,"010-1234-1234","F");
        //결과 값 ---> return this ----> com.
        System.out.println("-------------------");

        Person p2 = new Person();
        p2.name = "홍길동";
        p2.age = 10;
        p2.phone = "010-1234-1234";
        p2.gender = "M";



    }
}
