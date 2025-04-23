package com.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        //배열을 사용해서 랜덤한 숫자 6개를 저장하고 출력해보자.
        //배열은 보통 for (반복문과 함계 사용이 된다.)

        //랜덤한 숫자를 뽑아주는 도구 준비 부터 핮
        Random random = new Random();
        //Random random = new Random();

        //배열은 연관된 데이터 타입을 하나 통으로 관리하기 위해 사용할 수 있다.
        //정수 값 6개를 담을 수 있는 배열을 선언해 보자
        int[] intBoxes = new int[6];
        for (int i = 0; i < intBoxes.length; i++) {
            // i =0
            intBoxes[i] = random.nextInt(45) + 1;
            //int[] intBoxes = nex int[6];
            //for (int i = 0 ; i < intBoxes.)
        }
        // 자바 개발자들이 만들어 준 정렬 기능이 있다.
        Arrays.sort(intBoxes);
        // System.out.println(intBoxes);
        for (int i = 0; i < intBoxes.length; i++) {
            //\<-- 이스케이프 문자 문자로 보지말고 명령어로 인식해 t <-- 탭 간격을 의미
            System.out.printf(intBoxes[i] + "\t");
        }
    }


}
