package com._this;

/**
 * 클래스 설계하는 측 코드
 */
public class Person {

    //this 에 3가지 사용법
    // 1.자기 자신의 주소를 가리킴
    // 2.생성자에서 다른 생성자를 호출할때 사용할 수 있다
    // 3.자신의 주소를 반환 시킬 수 있다.

      String name;
     int age;
     String phone;
     String gender;//f , m

    public Person() {}
    //첫번째 생성자 사용방법 this.
    // 1.사용 방법(문법,왜)
    public Person(String name, int age){

        // 매개변수 = 매개변수
        // 맴버 변수 = 매개변수
        this.name = name;
        this.age = age;
        System.out.println("1번 생성자 호출 됨");
        //this.name = name
    }

    //2. 사용방법 this(); <-----
    // this는 생성자에서 다른 생성자를 호출할 수 있다.
    public Person(String name,int age, String phone) {
        //System.out.println("11111111111111111");
        //this.name =name;
        //this.age = age;
        this(name, age);// 두번째 사용법
        this.phone = phone;
        System.out.println("2번 생선자 호출 됨");
    }

    public Person(String name, int age, String phone, String gender){
        this(name, age, phone);
        this.gender= gender;
        System.out.println("3번 생성자 호출 됨");
    }
    //현재 생성된 객체 즉, 나의 주소를 외부로 반환시킬 수 있다.
    // 디자인 패턴(프로그램 작성할 때 일관 된 문제가 발생 할 수 있다. )
    //특정 코드의 패턴을 만들어서 해결해 나가는 방법적인 코드 패턴이다.
    public Person getperson(){
        return  this;
    }


 }
