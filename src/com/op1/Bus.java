package com.op1;

public class Bus {

    private int busNumber;
    private int count;
    private  int money;
    // private int busNumber;
    //private int count;
    //private int money;

    //생성자
    public Bus(int busNumber){
        this.busNumber = busNumber;
        //public Bus(int busNumber){
        //this.busNumber = busNumber;}

    }
    //승객을 태운다.
    public void take(int money){
        this.money += money;
        count++;
        //public void take(int money){
        //this.money += money
        //count++;}
    }

    //상태창
    // void 는 리턴할 값이 없을 때 사용하고 보여줄 값이나, 넣어줄 값이 없이 인출용으로 쓸때 사용한다.
    public void showInfo(){
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("승객 수 : " + count);
        System.out.println("버스 수익금 : " + money);
    }

}
