package com.array;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {

        // 난수 발생 기능 - 랜덤한 숫자 하나 만들어 주는 도구
        //자바 개발자들이 미리 만들어 준 기능
        Random random = new Random();
        // 문서 <-- 구글링<--chap gpt
        //0~44까지 랜덤한 숫자 하나 발생해 준다.
        //1~45

        //배열과 for 문 활용해서 코드를 수정해주세요
        int ranInt1 = random.nextInt(45) + 1;
        int ranInt2 = random.nextInt(45) + 1;
        int ranInt3 = random.nextInt(45) + 1;
        int ranInt4 = random.nextInt(45) + 1;
        int ranInt5 = random.nextInt(45) + 1;
        int ranInt6 = random.nextInt(45) + 1;

        int[] ranInts = new int[6];
        for(int i = 0; i < ranInts.length; i++) {
            ranInts[i] = random.nextInt(45) + 1;
            System.out.println("출력값 확인 : " + ranInts[i]);
            //int[] ranInts = new int[6];
            //for( i = 0; i < ranInts.length; i++)
            //ranInts[i] = random.nextint(45)+ 1;
            //System.out.println("출력값을 확인 : " + ranInts[i]);}
            //int[] ranInts = new int [6];
            //for(i=0; i < ranInts.leangth; i++){
            //ranInts[i] = random.nextint(45)+1;
        }


    }//end of main
}
