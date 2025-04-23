package com.polymorphism;

public class FruitTest1 {

    public static void main(String[] args) {
        //다양한 형태로 바라볼 수 있다.-다향성
        Fruit fruit1 = new Banana(); //업캐스팅
        Fruit fruit2 = new Peach();//업캐스팅
        // 다운 캐스팅
        //String oring1 = ((Banana)fruit1).origin;
        ((Banana)fruit1).saleBanana();

        fruit1.showInfo();
        System.out.println("----------");
        fruit2.showInfo();
        fruit1.showInfo();
        //사전 기반 지식으로 컴파일, 런타임정보
        //위 상황에서 바나나의 원산지를 정보를 출력하시오.
        //업캐스팅된 상태: 컴파일 시점에 부모에 있는 변수나 , 메섣드만 확인 가능
        String resultOrigin = ((Banana) fruit1).origin;// 다운 캐스팅 처리
        System.out.println("바나나 원산지 : " + ((Banana) fruit1).origin);

        //키워드 - 인스턴스오브 연산자
        //instanceof --> 예약어. 참이면 반환 거짓이면 안함
        if (fruit1 instanceof Peach) {
            System.out.println("여기 들어올까요? 1");
        }
        if (fruit1 instanceof Banana) {
            System.out.println("여기 들어올까요? 2");
        }

        //도전문제
        //fruit1 에 saleBanana() 메서드를 호출 하시오.
        ((Banana) fruit1).saleBanana();
        //검증
        fruit1.showInfo();

    }//end of main
}// end of class
