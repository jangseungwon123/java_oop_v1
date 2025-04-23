package com.starcraft_v01;

/**
 * @jang
 */
public class Zealot {
    private String name;
    private int power;
    private int hp;
    //public class Zealot {
    // private String name;
    // private int power;
    //private int hp;

    // 생성자 1
    public Zealot(String name) {
        this.name = name;
        this.power = 5;
        this.hp = 80;
        //public Zealot(String name) {
        //this.name = name;
        //this.power = 5;
        //this.hp = 80;
    }

    //read only --> getter

    public String getName() {
        return name;
        //
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    //setter 는 안만들 예정


    public void attackZergling(Zergling zergling) {
        zergling.beAttacked(this.power);
        System.out.println(name + " 이 "+     zergling.getName() + "을 공격합니다.");
    }


    public void attackMarine(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + " 이 " +marine.getName() + "공격합니다");
    }


    public void beAttacked(int power) {


        if (this.hp <= 0) {
            System.out.println(name + "이(가) 이미 사망하였습니다.");
            //실행 제어권을 반납하고 싶으면 돌아가 코드!!
            return;
        }
        this.hp -= power;
        System.out.println(name + "(이)가 공격을 당합니다");


    }


    public void showInfo() {
        System.out.println("-------✨상태창✨------");
        System.out.println("질럿 이름 : " + name);
        System.out.println("질럿 공겨력 : " + power);
        System.out.println("질럿 체력 : " + hp);
    }
}
