package com.mytest;

import java.util.Scanner;

public class Basic_12 {

    // if (조건식){
    //수행문이 // 조건식이 참인경우 수행문이 수행
    //false일경우 수행안됨
    public static void main(String[] args) {

        // 100~90 : A 학점 입니다.
        // 89~80 : B 학점 입니다.
        // 79~70 : C 학점 입니다.
        // 69~60 : D 학점 입니다.
        // ~59 : F 학점 입니다.
        // 단, 100~0값이 아닌 값을 입력했다면
        // 잘못된 입력 입니다. 출력하기

        //만약 잘못된 값이 들어왔다면 아래 구문을 출력하지 않도록 코드 수정
//        System.out.println("당신의 학점은 " + grade + "입니다.");
        Scanner sc = new Scanner(System.in);
        System.out.println( "점수를 기입해주세요 : ");
        int score = sc.nextInt();
        char grade = 'x';


        if (score >= 90) {

            grade = 'A';
        } else if (80 <= score && score <= 89) {
            grade = 'B';
        } else if (70 <= score && score <= 79) {
            grade = 'C';
        } else if (60 <= score && score <= 69) {
            grade = 'D';
        }else {
                grade = 'F';
        }
        System.out.println(((0 <= score) && (score <= 100)) ?  grade : "학점을 다시 입력하세요"  );


    }
}