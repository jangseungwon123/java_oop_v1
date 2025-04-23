package com.starcraft_v01;

import java.util.Scanner;

public class GameTest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체 생성 3 ~ 6
        Zealot zealot1 = new Zealot("외계인1");
        Zealot zealot2 = new Zealot("외계인2");
        Zergling zergling1 = new Zergling("괴물1");
        Zergling zergling2 = new Zergling("괴물2");
        Marine marine1 = new Marine("해병1");
        Marine marine2 = new Marine("해병2");

        // 행위 ......
        // while() 1.대상 2. 공격 0.종료
        while(true){

            System.out.println("1.마린 2.저글링 0. 종료");
            int choice = sc.nextInt();

            if(choice == 1) {
                zealot1.attackMarine(marine1);
            } else if(choice == 2) {
                
                if(zergling1.getHp() <= 0) {
                    System.out.println("이미 사용해서 공격 불가능");
                } else {
                    marine1.attackZergling(zergling1);
                }

            } else if (choice == 0) {
                break;
            } else  {
                System.out.println("종료");
            }

        }


    }
}
