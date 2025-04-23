package com.polymorphism;

public class EMart {

    public static void main(String[] args) {

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        //배열
        //배열을 사용할때는 반드시 크기를 먼저 지정해야한다.
        //배열의 길이와 요소의 길이(크기)는 항상 동일한 것은 아님
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[2];
        peaches [0] = new Peach();
        peaches [1] = new Peach();

        System.out.println("---------------");
        //다향성 --> 유연한 코드를 작성할 수 있다.

        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();
        fruits[4] = null;

        //fruit1.showInfo()
        //도전 문제
        for(int i = 0; i < fruits.length; i++){
            System.out.println("i : " + i);
            if(fruits[i] instanceof Peach){
                System.out.println("---------------------------복숭아 사세요---------------------------------");
                System.out.println(fruits[i].name + "," +fruits[i].price );
            } else if(fruits[i] instanceof Banana){
                System.out.println("---------------------------바나나 사세요---------------------------------");
                ((Banana) fruits[i]).saleBanana();
                System.out.println(fruits[i].name + "," +fruits[i].price+","+((Banana) fruits[i]).origin);
            }
            //배열안에 들어가 있는 각각의 객체를 전부 호출하시오.
            //단 데이터 파일이 바나나일 경우 원산지 정보와, saleBanana()메서들 출력하게
            //코드를 작성하시오.
        }
        //코드 작성시 오류는 안됨!

    }//end of main
}//end of class
