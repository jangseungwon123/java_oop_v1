package com.association;

public class BaseballPlayer {

    private String name;
    //private String name;

    private BaseballTeam bTeam;
    //private BaseballTeam bTeam

    public BaseballPlayer(String name) {
        this.name = name;
        bTeam = null;
        //public BaseballPlayer(String name){
        //this.name = name;
        //bTeam = null;

    }

    public void join(BaseballTeam bTeam) {
        this.bTeam = bTeam;
        System.out.println(name + " is joining to " + bTeam.getName());
        //public void join(BaseballTeam bTeam){
        //thid . bTeam = bTeam;
        //System.out.println(name + " is joining to " bTeam.getname)

    }

    public void showTeam() {
        if (this.bTeam != null) {
            System.out.println(name + " is joined in " + this.bTeam.getName());
        } else {
            System.out.println("There is no team joined");
            //public void showTeam(){
            //if(this.bTem != null){
            //System.outprintln(name+ "is joined in" + thid,bTeam.getName());
        //}else {
            //System.out .println(name + "is joines in " + this.bTeam.getName());

        }
    }

    public void quit() {
        if (bTeam == null) {
            System.out.println("There is no team joined already");
        } else {
            System.out.println("Quitting the " + bTeam.getName());
            this.bTeam = null;
            //public void quit(){
            //if (bTeam == null){
            //System.out.println("There id no team join already");
            //else{
            //System.out.prinntln("Quitting the " +bTeam.getName());
            //this.bTeam = null;
        }
    }

    public static void main(String[] args) {
        BaseballTeam SDP = new BaseballTeam("San Diego Padres");
        BaseballPlayer player1 = new BaseballPlayer("Lee");
        player1.join(SDP);
        player1.showTeam();
        player1.quit();
        player1.showTeam();
        //public static void main(String[] args){
        //BaseballTeam SDP = new BaseballTeam("San Diago padres")
        //player1.join(SDP);
    }

}