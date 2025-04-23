package com.array;

public class ArrayTest2 {

    public static void main(String[] args) {

        char[] alphabet = new char[26];
        //char[] alphabet = new char[26];

        //char 타입은 원래 정수 값이다.
        //컴퓨터는 0,1 이진수로 데이터 표현한다.
        //컴퓨터는 문자, 문자열을 굉장히 많이 다룸.
        //컴퓨터에서 문자를 표현하기 위해서 문자표라는것을 사용
        //아스키 코드, EUC-KR, (유니코드 문자표(4바이트)를 전세계 공통으로 사용하기 위해 만들었다.)
        //아스키코드 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        //[][][][][][][][]<----- 정수 0 ~ 127까지

        alphabet[0] ='A';// 정수값 --> 65
        System.out.println((int)alphabet[0]);
        alphabet[1] ='B';
        System.out.println((int)alphabet[1]);
        alphabet[2] ='C';
        System.out.println((int)alphabet[2]);
        //alphabet[0] = 'A';
        //System.out.println((int)alphapat[0]);

        //인코딩
        //문자를 컴퓨터가 이해할 수 있는 숫자(코드값)로 바꾸는 과정
        int code1 = (int)'A';// 인코딩
        //디코딩
        //숫자(코드값)을 사람이 읽을 수 있는 문자로 바꾸는 과정을 말한다.
        char code = (char)66;//디코딩

        //반복문을 통해서 알파벳 A ~ Z가지 출력

        // 초기화식 (값을 넣ㄷ
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] =(char)('a' + i);


        }
        //for 구무누을 활용해서 그대로 출력해보자
        for(int i = 0; i < alphabet.length; i++){
            System.out.println(alphabet[i]);
        }



    }

}//end of class
