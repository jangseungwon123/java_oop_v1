package com.composition;

public class Car {

    String name;
    int price;
    //String name;
    //int price;
    //포험 관계(컴포지션)
    //car 클래스는 engine 객체를 포함합니다.
    Engine engine;
    //Engine engine;



    public Car(){
        //자동차 객체가 생성될 때 엔진도 함계 생성된다.
        //강한 의존성
        engine = new Engine();
        //public car(){
        //engine = new Engine();
        //}
    }

    void startCar(){
        engine.start();//car 객체를 통해 engine  의 start() 메서드를 호출
        System.out.println("자동차가 출발합니다");
        //void startCar(){
        //engine.start();
        //System.out.println("자동차가 출발합니다")}
    }

    void stopCar(){
        engine.stop();
        System.out.println("자동차가 멈춥니다." );
        //void stopCar(){
        //engine.stop();
        //System.out.println(" 자동차가 멈춥니다.")}
    }

    //테스트 코드 작성
    public static void main(String[] args) {

        //TODO**컴포지션 관계는**
        //자동차 클래스 내부에서 엔진 객체를 생성시켜야 컴포지션 관계이다.
        Car car = new Car();
        car.startCar();
        car.stopCar();
        //public static void main(String[] args){
        //Car car = new Car();
        //car.startCar();
        //car.stopCat();

    }//end of main
}
