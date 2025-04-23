package com.overloading;

/**
 * 메소드 오버로딩이란
 * 같은이름릐 메서드를 여러개 정의하는것
 */
public class Calculator {

    //덧셈 메서드 만들어 보기
    public int add(int a , int b){
        return a + b;
    }

    //매개변수에 데이터 타입이 다르면 구분가능
    public double add(double a, double b){
        return  a+b;
    }

    public int add(int a , int b , int c){
        return  a+ b + c;
    }

    public String add(String str1, String str2){
        return str1 + str2;
    }

    //main 함수 -코드의 진입점
    public static void main(String[] arge){
        //println()--> 메서드 오버로딩 기법이었다.




    }// end of main
}
