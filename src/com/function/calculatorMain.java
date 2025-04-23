package com.function;

/**
 * 함수란? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록이야.
 * static 을 사용하면 객체 없이 호출 가능 해!
 */
public class calculatorMain {

    public static void main(String[] args) {
        //테스트 용 숫자
        int num1 = 10;
        int num2 = 5;
        int testumber = 7;

        //더하기 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        // int sum = add(num1, num2)
        //System.out.println(num1 + " + " + num2 + " = " + sum);

        // 빼기 함수 호출
        int sum2 = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + sum2);
        //int sum2 = subtract(num1, num2)
        //System.out.println(num1 + " - " + num2 + " = " + sum2);

        // 곱하기 함수 호출
        int sum3 = multiply(num1,num2);
        System.out.println(num1 + " * " + num2 + " = " + sum3);
        //int sum3 = multiply(num1,num2);
        //System.out.println(num1 + " * " + num2 + " = " + sum3)

        // 나누기 함수 호출
        double sum4 = divide(num1 , num2);
        System.out.println(num1 + " / " + num2 + " = " + sum4);
        //double sum4 = divide(num1, num2);
        //System.out.println(num1 + " / " + num2 + " = " + sum4);

        // 짝수 판별 함수 호출
        boolean sum5 = isEven(num1);
        System.out.println("짝수 판별 결과 : " + sum5);
        //boolean sum5 = isEven(num1);
        //System.out.println("짝수 판별 결과 : " + sum5);

        // 홀수 판별 함수 호출
        boolean sum6 = isOdd(num1);
        System.out.println("홀수 판별 결과 : " + sum6);
        // boolean sum6 = isOdd(num1);
        //System.out.println("홀수 판별 결과 : " + sum7)


        //double result1 = divide( 10 , 0);
        //  System.out.println("result1 : "  + result1);

    }

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b; // 입력받은 a와 b를 더하고 반환
        //static int add(int a, int b){
        //return a + b ; }
    }

    // 두 숫자를 빼는 함수
    static int subtract(int a, int b) {
        return a - b;//입력받은 a에서 b를 반환
        //static int subtract(int a, int b){
        //return a - b; }
    }

    //두 숫자를 곱하는 함수
    static int multiply(int a, int b) {
        return a * b;// a와 b를 곱해서 반환
        //static int multiply(int a , int b){
        //return a * b;  }
    }

    // 두 숫자를 나누는 함수 -->
    static double divide(int a, int b) {
        //방어적 코드를 잘 작성해아 한다.
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b;
        //static double divide (int a , int b){
        //if (b == 0){
        //System.out .println("0으로 나눌 수 없습니다.")
        //return a /b }
    }

    //짝수인지 판단하는 함수 - 매개변수
    static boolean isEven(int number) {

        return number % 2 == 0; //나머지가 짝수면 -->true, 아니면 false
        //static boolean isEven(int number){
        //return number % 2 == 0;
    }

    //홀수인지 판별하는 함수 - 매개변수1
    static boolean isOdd(int numder) {
        return numder % 2 != 0;
        //static boolean isOss(int number){
        //return number % 2 != o;}
    }


}
