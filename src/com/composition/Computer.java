package com.composition;

import javax.swing.*;
import java.security.spec.ECPublicKeySpec;
import java.util.Scanner;

public class Computer {

    String name;
    static CPU[] cpus = new CPU[5];


    public Computer(String name) {
        cpus = new CPU[5];
        this.name = name;
        cpus[0] = new CPU("A");
        cpus[1] = new CPU("B");
        cpus[2] = new CPU("C");
        cpus[3] = new CPU("D");
        cpus[4] = new CPU("E");
    }

    void showCpus() {
        // 초기화식; 조건식 i < cups.length;  증감식
        for (int i = 0; i < cpus.length; i++) {
            System.out.println(cpus[i].modelName + "입니다");
        }
    }

    void startAllCPUs() {
        for (int i = 0; i < cpus.length; i++) {
            cpus[i].start(); // 각 CPU 실행
            break;
        }
    }

    // 모든 CPU 종료
    void stopAllCPUs() {
        for (int i = 0; i < cpus.length; i++) {
            cpus[i].stop();// 각 CPU 종료
            break;
        }
    }


    public static void main(String[] args) {

        // computer 객체를 인스턴스화 해줘야 cpus 배열이 생성이 된다.
        // computer 객체 안에 cpus 배열이 포함되어 있다 (포함 관계)
        // cpu 객체를 따로 computer 객체를 생성하지 않고 할려면?
        // cpu 인덱스 연산자에 각 객체의 생성을 해줘야 한다.
        // ex : cpu[0] = new CPU();

        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer("삼성");


        final String COMPUTERSTART = "1";
        final String COMPUTERSHOW = "2";
        final String COMPUTERSTOP = "0";

        boolean flag = true;
        while (true) {
            System.out.println("1번 시작 2번 조회 0번 종료");
            String choice = scanner.nextLine();
            if (choice.equals(COMPUTERSTART)) {
                System.out.println("컴퓨터를 실행하겠습니다.");
                computer.startAllCPUs();
            } else if (choice.equals(COMPUTERSHOW)) {
                System.out.println();
                computer.showCpus();
            } else if (choice.equals(COMPUTERSTOP)) {
                System.out.println("컴퓨터를 종료하겠습니다.");
                computer.stopAllCPUs();
                break;
            } else {
                System.out.println("틀린 번호 입니다.");
            }
        }


//    public static void main(String[] args) {
//        Computer computer = new Computer("삼성");
//        computer.showComputer();


    }
}


