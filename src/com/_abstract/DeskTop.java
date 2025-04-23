package com._abstract;

public class DeskTop extends Computer{

    @Override
    public void display() {
        System.out.println("모니터");
    }

    @Override
    public void typing() {
        System.out.println("타자쳐");
    }
}
