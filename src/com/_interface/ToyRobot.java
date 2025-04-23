package com._interface;

//장난감 로봇이 가전을 받게 된다면 의미가 맞지 않음!!
//추상 클래스보다 더 유현한 설계 기법인 인터페이스가 있다.
public class ToyRobot implements RemoteController, SoundEffect {

    System name;

    @Override
    public void turnOn() {
        System.out.println("장난감 로봇을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("장난감 로봇을 끕니다.");
    }

    @Override
    public void soundOn() {
        System.out.println("뚜뚜~~뚜~~뚜뚜");
    }
}
