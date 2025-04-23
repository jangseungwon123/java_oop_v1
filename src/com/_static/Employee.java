package com._static;

public class Employee {

    private int employeeId;
    private String name;//이름
    private String department;//부서
    //private int employeeId;
    //private String department;
    //private String name

    //생성자
    public Employee(String name){
        this.name = name;
        //클래스 변수를 활용해보자. company.
        //클래스 이름으로 접근할 수 있다.
        employeeId = Company.emSerialNumber;
        Company.emSerialNumber++;
        //employeeId = 1;
        //public Employee(String name ) {
        //this.name = name;
        //employeeId = Company.emSerialNumber;
        //Company.emSerialNumber++
    }

    //getter
    public int getEmployeeId(){
        return employeeId;
        //public int getE
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

}
