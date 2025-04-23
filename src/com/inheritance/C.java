package com.inheritance;

//상속이란 기법을 배운 개발자라면...
//A 클래스에 속성과 상태를 물려받을 수 있다.

//자바에서는 단일 상속만을 지원한다.
//부모클래스 A가 되고 C클래스가 자식 클래스가 됨
public class C extends A {
    //C extends A
    //여기 코드에 보이지 않지만 자동으로 A 에 선언된
    //필드를 물려 받겠다.

    int level;
    String nickName;

}
