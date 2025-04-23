package com.starcraft_v01;

import java.util.Scanner;

public class GameTest3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체 생성 3 ~ 6
        Zealot zealot1 = new Zealot("외계인1");
        Zergling zergling1 = new Zergling("괴물1");
        Marine marine1 = new Marine("해병1");

        // 대상을 선택하고
        // 선택 대생 제외하고 누구를 공격할래? --> 공격

        // 행위 ......
        // while() 1.대상 2. 공격 0.종료
        while (true) {
            ///  1 2 3 0
            ///  1 --> 누구 공격할래 --> 키보드 값 받기 --> 값에 따라서 마린, 저글링
            System.out.printf("1. 마린 2. 저글링 3. 질럿 중 하나를 선택하시오 0을 선택시 종료 됩니다 : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("누구를 공격하시겠습니까? 1. 저글링 2. 질럿");
                int choice1 = sc.nextInt();
                if (choice1 == 1) {
                    marine1.attackZergling(zergling1);
                    System.out.println();
                } else if (choice1 == 2) {
                    marine1.attackZealot(zealot1);
                }

            } else if (choice == 2) {
                System.out.println("누구를 공격하시겠습니까? 1. 마린 2. 질럿");
                int choice1 = sc.nextInt();
                if (choice1 == 1) {
                    zergling1.attackMarine(marine1);
                    System.out.println();
                } else if (choice1 == 2) {
                    zergling1.attackZealot(zealot1);
                }

            } else if (choice == 3) {System.out.println("누구를 공격하시겠습니까? 1. 마린 2. 저글링");
                int choice1 = sc.nextInt();
                if (choice1 == 1) {
                    zealot1.attackMarine(marine1);
                    System.out.println();
                } else if (choice1 == 2) {
                    zealot1.attackZergling(zergling1);
                }

            } else if (choice == 0) {
                System.out.println("게임이 종료 됩니다");
                break;

            } else {
                System.out.println(" 번호를 다시 선택해 주세요");
            }
            System.out.println();

        }



    }

}
