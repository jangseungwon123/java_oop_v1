package com.books;

//수입하다 가져오다.
import com.starcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];//인덱스 배열을 생성하는 코드식
        //Zealot[] zealots = new zeolot[5]; // 인덱스 배열을 생성하는 코드식

        //반복문 사용하지 말고 질럿 3마리 0,1,3 인덱스에 넣어주세요
        zealots[0] = new Zealot("참질럿");
        zealots[1] = new Zealot("가짜질럿");
        zealots[3] = new Zealot("몰라질럿");
        //zelots[0] = new Zealot(1)
        //zelots[1] = new Zealot(2)
        //zelots[3] = new Zealot(3)

        //0번째 인덱스에 주소값을 넣어둔 기능 showInfo()를 호출 해주세요
        zealots[0].showInfo();
        //zealots[0].showInfo();
        //System.out.println(zealots[0].showInfo());---> 코드를 따라가면 적혀 있는 값이
        // void라 텅빈 것을 출력할수 없기에 sout을 사용할 수 없다!!!! 이유를 확실히 알고 쓰자!!
        // 반복문을 활용해서 배열안에 있는 질럿들에 showInfo()를 호출하시오
        for(int i =0; i < zealots.length; i++){
            if(zealots[i] != null){
                zealots[i].showInfo();
                //for(int i =0; i < )
            }

        }

    }//end of main
}
