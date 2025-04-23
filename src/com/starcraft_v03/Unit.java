package com.starcraft_v03;

public  class Unit {

    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Unit unit) {
        unit.beAttacked(this.power);
        System.out.println(name + " 이 " + unit.getName() + "을 공격합니다.");
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
        System.out.println(" 이름 : " + name);
        System.out.println(" 공겨력 : " + power);
        System.out.println(" 체력 : " + hp);
    }
}
//        for (int i = 0; i < units.length; i++) {
//            if (units[i] != null) {
//                if (units[i] instanceof Marine) {
//                    ((Marine) units[i]).attack(units[i + 1]);
//                    ((Marine) units[i]).showInfo();
//                } else if (units[i] instanceof Zealot) {
//                    ((Zealot) units[i]).attack(units[i + 1]);
//                    ((Zealot) units[i]).showInfo();
//                } else if (units[i] instanceof Zergling) {
//                    if (i + 1 > units.length) {
//                        ((Zergling) units[i]).attack(units[i + 1]);
//                    } else {
//                        ((Zergling) units[i]).attack(units[i - 1]);
//
//                    }
//                    ((Zergling) units[i]).showInfo();
//                }
//            }
//        }

//Unit[] units = new Unit[100];
//units[0] = new Zealot("지러1");
//units[1] = new Marine("마리1");
//units[2] = new Zergling("저그리1");
//units[3] = new Zergling("지러2");
//units[4] = new Zergling("마리2");
//units[5] = new Zergling("저그리2");
//units[6] = new Zergling("지러3");
//units[7] = new Zergling("마리3");
//units[8] = new Zergling("저그리3");
//units[9] = new Zergling("지러4");