package com.association;

public class Student {

    private String name;
    private Course course; //연관관계(넓은 의미의 연관관계)

    public Student(String name) {
        this.name = name;
        course = null;// 초기에는 수강하지 않음!
    }

    //수강을 듣다.(과목에 대한 정보는 course에 있다.)

    public void enroll(Course coures) {
        this.course = coures;
        System.out.println(name + "가" + coures.getName() + "강의를 수강합니다");
    }
    //도전과제
    //수강종료 기능만들어보세요
    public void end(){
        if(course == null){
            System.out.println("이미 수강중인 상태가 아닙니다.");
        } else {
            System.out.println(course.getName() + "수강이 종료됩니다.");
            this.course = null;
        }


    }


    //학생의 현재 수강중인 상태를 보여주는 기능
    public void showCoures() {
        if (this.course != null) {
            System.out.println(name + "이(가)" + this.course.getName() + "을 수강하고 있는중");
        } else {
            System.out.println("수강중인 강의가 없다");
        }
    }


}
