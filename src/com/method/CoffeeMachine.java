package com.method;

/**
 * 메서드 연습
 * 메서드란 객체에 소속된 함수로 ,  클래스의 상태 (데이터)를 활용하거나 객체와 관련된
 * 작업을 처리할때 사용
 */
public class CoffeeMachine {

    //멤버변수
    //커피머신의 상태 : 물과 원두의 양
    int water; //물의 양(ml)
    int coffee; //커피 원두의 양(g)
    //int water;
    //int coffee;

    //사용자 지정 생성자
    public CoffeeMachine(int w, int c) {
        water = w;
        coffee = c;
        System.out.println(water);
        System.out.println(coffee);
        // public CoffeeMachine(int w , int c){
        // water = w;
        // coffee = c;
        //System.out.println(water);
        //System.out.println(coffee); }
    }

    // 행위 설계
    //메서드 1 : 물 채우기
    public void refilWater(int amount) {
        if (amount > 0) {
            water += amount;
            System.out.println(amount + "ml의 물을 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요");
        }
        //public void refilWater(int amount){
        //if(amount > 0){
        // water += amount;
        //System.out.println(amount + ml의 물을 채웠습니다.")
        //}else{
        // System.out.println("0보다 큰 양의 물을 채워주세요")
        //     }
        //}

    }

    //메서드 2 : 커피 원두 채우기
    public void refillCoffee(int amount) {
        // 방어적 코드 작성
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + "g의 커피 원두를 채웠습니다");
        } else {
            System.out.println("0보다 큰 양의 원두를 채워주세요");
        }
        //public void refillCoffee(int amount){
        //if(amount > 0) {
        //coffee += amount;
        //Systems.out,println(amount + " g의 커피 원두를 채웠습니다");
        //} else {
        //   System.out.println("0보다 큰 양의 원두를 채워주세요");
        //}
        //}
    }

    //메서드 3 :커피 만들기
    public String makeCoffee() {
        // 커피 한잔에 물 100ml 원두가 10g 필요하다고 가정할때
        //방어적 코드 작성
        if (water >= 100 && coffee >= 10) {
            water -= 100;//물 사용
            coffee -= 10; //원두사용
            return "맛있는 커피 한잔 완성";
        } else {
            return "재료가 부족해요 물이나 커피를 채워주세요";
        }
        //public Sring makeCoffee() {
        //if (water >= 100 && coffee >= 10){
        //water -= 100;
        //coffee -= 10;
        //return " 맛있는 커피 한잔 완성"
        //} else {
        //  return "재료가 부족해요 물이나 커피를 채워주세요"
        //}
    }
    //연습문제
    //사용자 정의 생성자를 멤버 변수  water, coffe 값이 초기화 될 수 있도록 코드를 추가 해주세요.
    public void showInfo(){
        System.out.println("---------재료량-------------");
        System.out.println(water + "남아있습니다");
        System.out.println(coffee + "남아있습니다.");


    }


}


