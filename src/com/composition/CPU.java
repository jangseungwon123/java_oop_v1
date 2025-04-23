package com.composition;

public class CPU {

    String modelName;

    public CPU(String modelName){
        this.modelName = modelName;
    }

   public void start(){
        System.out.println("CPU 가 실행됩니다.");
    }
   public void stop(){
        System.out.println("CPU가 종료됩니다.");
    }
    void cpuNumber(){
        System.out.println( modelName + "cpu입니다.");
    }

}
