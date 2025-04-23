package com.inheritance;

public class Cal {

    // 메서드를 만들어 보자

    public int sum(int n1, int n2){
        return  n1 + n2;
    }

    public int multiply(int n1 , int n2){
        return  n1 * n2;
    }
}// end og class

// xxx.java 하나의 자바 파일에 여러개의 클래스를 선언할 수 있다.
//단 스코프는 분명히 구분이 되어 진다.
//중요. 단 하나의 자바파일에 public 클래스는 오직 하나만 존재할 수있다.
//문법 그냥외워요.

//부모 자식관계 클래스가 됨
class ChildCal extends Cal{

    //마이너스 기능을 추가 요청
    public int minus(int n1 , int n2){
        return n1 - n2;
    }

    //곱하기 기능은 -선임
    //곱하기 기능에서 n1 과 n2에 0이 들어 온다면 0을 입력하지 마시오.
    //라는 문구를 나올수 있게 수정 요청

    //상속을 사용했을 때 메서드 오버라이드 개념!!!!이 있다.
    //부모 클래스에 메서드를 재정의할 수 있다. 이것을 메서드 오버 라이드라고한다.
    //문법- 부모 클래스에 메서드 이름과 매개변수 개수 및 타입이 동일해야함.
    public int multiply(int n1 , int n2){
        if(n1 == 0 || n2 ==0){
            System.out.println("0을 입력하지마시오.");
        }
        return  n1 * n2;
    }


}// end of class

