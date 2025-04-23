package com.composition;

public class Room {

    private String tybe;
    //private String tybe;

    public Room(String tybe){
        this.tybe = tybe;
        // public Room(String type){
        //this.tybe = tybe;
    }
    void  describe(){
        System.out.println(tybe + "방 입니다.");
        //void describe(){
        //System.out.println(tyve + " 방 입니다.")
    }

}
