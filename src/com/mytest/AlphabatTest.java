package com.mytest;

public class AlphabatTest {
    public static void main(String[] args) {

        //알파벳을 순서대로 출력해보자.

        //순서대로 한번에 뽑기 위해 인덱스로 통으로 만들어보자
        // 배열 선언에 문법
        char[] alphabet = new char[26];

        // 값을 저장해 보자. 0 인덱스
        alphabet[0] = 'A';
        System.out.println((int)alphabet[0]);
        alphabet[1] = 'B';
        System.out.println((int)alphabet[1]);
        alphabet[2] = 'C';
        System.out.println((int)alphabet[2]);

        //for문을 사용 []안에 데이터를 넣어보자
        // for (초기화식;  조건식(비교연산자) ; 증감식 )
        // 조건식 --> true, false
        for(int i = 0; i < alphabet.length; i++ ){
            alphabet[i] = (char)('A' + i);
            //alphabet[A] =(char)(65 + 0);
            //alphabet[B] =(char)(66 + 1);
        }

        for( int i = 0; i < alphabet.length; i++ ){
            System.out.println(alphabet[i] );

        }



    }// end of main
}
