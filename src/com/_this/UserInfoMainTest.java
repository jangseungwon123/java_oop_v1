package com._this;

import org.w3c.dom.ls.LSOutput;

public class UserInfoMainTest {
    public static void main(String[] args) {
        UserInfo userInfo1 = new UserInfo("집","키","길동","부산","123");
        System.out.println( userInfo1.getUserId());
        System.out.println( userInfo1.getUserPassword());
        System.out.println( userInfo1.getUserName());
        System.out.println( userInfo1.getUserAddress());
        System.out.println( userInfo1.getUserNumber());

    }
}
