package com.mytest;

public class Basic_7 {

    public static void main(String[] args) {

        //데이터 10, 100. 100 변수 선언과 동시에 초기화 화면 출력
//        int a =10 ;
//        int b = 100 ;
//        int c = 100;
        //  int ageBox 상자 20 담기
        //ageBox 상자 값을 30 으로 변경히거 기존에 담겨 있던 데이터 다른것
       int ageBox =20 ;
       int ageBox2;
       ageBox2 = ageBox;
       ageBox= 30;
        System.out.println(ageBox);
        System.out.println(ageBox2);
        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        int a =1;
        int b =3;
        int temp;
        temp = a;
        a = b ;
        b = temp;
        System.out.println(a);
        System.out.println(b);



    }
}
