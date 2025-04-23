package com._this;

public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String userNumber;

    //생성자 매개변수 1개 ~ 5개 즉 , 생성자 5개 만들어 주세요(생성자 오버로딩)


    public UserInfo(String userId) {
        this.userId = userId;

    }

    public UserInfo(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;

    }

    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        this.userAddress = userAddress;
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String userNumber) {
        this(userId, userPassword, userName, userAddress);
        this.userNumber = userNumber;
    }

    // getter 메서드 만들어주세요
    public String getUserId() {
        System.out.printf("ID : ");
        return userId;

    }

    public String getUserPassword() {
        System.out.printf("pw : ");
        return userPassword;

    }

    public String getUserName() {
        System.out.printf("name : ");
        return userName;
    }

    public String getUserAddress() {
        System.out.printf("address : ");
        return userAddress;
    }

    public String getUserNumber() {
        System.out.printf("number : ");
        return userNumber;
    }

    // setter 메서드 만들어주세요
    public void setUserId(String userId) {
        // 멤버 변수 = 외부값
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        // 멤버 변수 = 외부값
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        // 멤버 변수 = 외부값
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        // 멤버 변수 = 외부값
        this.userAddress = userAddress;
    }

    public void setUserNumber(String userNumber) {
        // 멤버 변수 = 외부값
        this.userNumber = userNumber;
    }


}
