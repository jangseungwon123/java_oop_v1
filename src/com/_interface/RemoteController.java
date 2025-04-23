package com._interface;

public interface RemoteController {

    //인터페이스란 구현된것이 아무것도 없는 그림만 있는 기본 설계도이다.
    //모든 변수는 상수가 된다. public int final int N;
    //모든 메서드는 추상 메서드가 된다. 심지어 abstract도 키워드도 생략가능.

    //추상클래스보다 추상화가 더 높다.
    //TODO 인테페이스 사용할때 무언가 동작 중심의 클래스를 선언해야할때 사용해야한다.

    //인터 페이스는 표준이다. 또는 강제성있는 규약이다.

    //오직 static final 상수만을 가질 수 있다.
    public static final int SERIAL_NUMBER = 100;

    public abstract void turnOn();
    public abstract void turnOff();
}
