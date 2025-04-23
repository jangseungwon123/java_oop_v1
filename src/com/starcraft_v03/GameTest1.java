package com.starcraft_v03;

import javax.swing.*;
import java.util.Scanner;

public class GameTest1 {

    //실행에 흐름을 스스로 만들어 보자
    //배열, 객체, for ...다향성 확인
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Unit marine = new Marine("귀신");
       Unit zergling  = new Zergling("괴물");
       Unit zealot = new Zealot("악마");
       final String attack = "1";
       final String end = "2";


        //System.out.println("1.공격 0번은 종료");
       boolean flag = true;
        while (flag){
            System.out.println(" 공격할 대상을 선택해주세요");
            String choice = scanner.nextLine();
           if(1 == 1){



            }

        }

    }
}

