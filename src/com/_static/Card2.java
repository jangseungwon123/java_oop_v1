package com._static;

public class Card2 {

    //static 변수 : 모든 card 객체가 공유하며, 고유 번호를 생성하기 위해 사용할 수 있다.
    private static int cardCounter = 0;
    //private static inr cardCounter = 0;

    //인스턴스 변수
    private final int cardId;
    private final String cardName;
    //private final int cardId;
    //private final String cardName;

    public Card2(String cardName) {
        this.cardName = cardName;
        this.cardId = cardCounter++;
        //public Card2(String cardName){
        //this.cardName = cardCounter++;
    }

     //static 메서드
    public static int getCardCounter(){
        // static 메서드 나에서 인스턴스 변수를 사용할 수 없다.
        //왜? 인스턴스 변수는 객체가 생성된 이후에 사용될 수 있다.
        //System.out.println("cardName : " + cardName);
        //static변수
        return cardCounter;
        //public static int getCardCounter(){
        //return cardCounter;}
    }

    //인스턴스 메서드를 만들어 보자
    public void showInfo(){
        System.out.println(cardCounter);
        System.out.println(cardName + " 에 고유 번호는 " + cardId + "입니다");
        //public void showInfo(){
        //System.out.println(cardCounter);
        //System.out.println(cardName + " 에 고유 번호는 " + cardId + "입니다");
    }



    public static void main(String[] args) {
        //static 변수는 객체 생성전 사용가능
        //static 메서드는 객체 생성전 사용가능
        // 사용법(클래스 이름으로 접근가능)
        System.out.println(Card2.cardCounter);
        //인스턴스 메서드는 일까 스태이틱 메서드 이다
        //그래서 객체 생성전에 호출해 볼 수있다.
        System.out.println(Card2.getCardCounter());

        //Card2 c1 = new Card2("우리 카드1");
        //System.out.println(c1.cardId);

        //public static void main(String[] args){
        //System.out.println(Card2.getCardCounter());


    }//end of main
}
