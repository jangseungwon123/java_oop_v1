package com.books;

/**
 * 도서를 저장하고 관리할 수 있는 간단한 프로그램 만들어 보기
 * C R U D
 */
public class Book {

    private String title;
    private String author;
    private int totalpage;
    //private String title;
    //private String author;
    //private int totalpage;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        //public Book(String title ,String author){
        //this.title = title;
        //this.author = author;
    }

    public Book(String title, String author, int totalpage){
        this(title,author);
        this.totalpage = totalpage;
        //public Book(String title, String author, int totalpage){
        //this(title, author);
        //this.totalpage = totalpage;
    }

    //getter
    public  String getTitle(){
        return title;
        // public string getTitle(){
        //return title;
    }
    public String getAuthor(){
        return author;
        //public String getTitle(){
        //return autor;

    }
    public int getTotalpage(){
        return totalpage;
        //public int getTotalpage(){
        //return totalpage;}
    }

    public void setAuthor(String author){
        this.author = author;
        //public void setAuthor(String author){
        //this.author = author;}
    }

    public void showInfo (){
        System.out.println("=====상태창======");
        System.out.println("책 이름 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("총 페이지 : " + totalpage);

    }

}
