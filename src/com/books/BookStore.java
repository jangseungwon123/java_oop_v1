package com.books;

import java.util.Scanner;

/**
 * 모든 프로그래밍에 기본은 CRUD이다
 */
public class BookStore {
    //샘플데이터 5
    //샘플데이터 지우면 인덱스 번호 0부터 하면 됨
    static int curretBookIndex = 6;
    //staic int curreyBookIndex = 6; 저장 된 데이터 이후에 순차적으로 쌓일 i의 시작값이 될것이다.

    //메인 함수
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner(System.in);
        // 배열 준비
        Book[] books = new Book[100];
        //Book[] books new Book[100]; Book이라는 클라스를 데리고 만들어준것이다.
        //books = null;//가리키는 공간이 없다.
        boolean flag = true;
        //boolean flag = true; while문을 사용하기 위해 사용함

        //TODO-추후 삭제하기
        //샘플 데이터 미리 만들어 두기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘로");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유빌하라리");
        books[5] = new Book("홍길동전", "허균");
        // 샘플데이터를 사용하냐 안하냐에 따라 작업의 효율성이 달라진다. 샘플 데이터를 잘 쓰는 것도 능력!!1

        // 변하지 않을 상수를 설정할때 final을 사용하고
        //문자열 타입으로 넣기 위해 String 을 사용하고 그 뒤 전부 대문자(final)를 사용해야한다.
        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELLETE_ALL = "4";
        final String END = "5";
        //문자열도 받을 수 있다.
        while (flag) {
            System.out.println("*메뉴 선택*");
            System.out.println(" 1.저장 2. 전체조회 3.선택 조회 4. 전체 삭제 5. 종료");
            String selectedNumber = scanner.nextLine();// 문자열을 넣기 위해 .nextInt 말고 .nextLine을 사용했다.
            //숫자 비교할때 == 사용한다.
            //문자열 비교할 때 "문자열".equals("문자열") ---> ture, 다르면 false 반환한다.
            //문자열 비교할때 무조건 equals()메서드를 사용하자
            if (selectedNumber.equals(SAVE)) {
                System.out.println(">>저장하기<<");
                save(scanner, books);

            } else if (selectedNumber.equals(SEARCH_ALL)) {
                System.out.println(">>조회하기<<");
                readAll(books);

            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(">>책 제목으로 조회하기<<");
                readByTitle(scanner, books);

            } else if (selectedNumber.equals(DELLETE_ALL)) {
                System.out.println(">>전체 삭제하기<<");
                diletAll(books);

            } else if (selectedNumber.equals(END)) {
                System.out.println(">>프로그램을 종료합니다<<");
                flag = false; // while(false) 가 실행되어 종료됨.
            } else {
                System.out.println("잘못된 선택입니다");
            }
        }
    }// end of main

    //저장하기
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("-----save()-----");
        //사용자에게 값을 받아서 -데이터를 모아서 북 객체를 생성하도 배열 공간에 넣어야한다.
        System.out.println("책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("저자를 입력하세요");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        //books라는 배열에 북 객체를 저장하는 코드
        //인덱스 번호를 어디까지 사용했는지에 대한 정보도 필요하다.(static 변수로 관리 함)
        //방어적 코드
        if (curretBookIndex > books.length) {
            System.out.println("더이상 저장할 공간이 없습니다");
            return;
            //System.out.println("책 제목을 입력하세요");
            //String title =scaneer. nextline();
            //system.out.println("저자를 입력하세요")
            //String auter = scanner. nextline();
            //Box box = new(title,auter)
            //else if ()
        }

        books[curretBookIndex] = book;
        curretBookIndex++;


    }

    //전체 조회 하기
    public static void readAll(Book[] books) {
        System.out.println("-- readAll() --");
        //반복문 배열...
        for (int i = 0; i < books.length; i++) {
            //방어적 코드
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
            }
        }
    }

    //책 제목으로 조회 하기
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("----readByTitle----");
        System.out.println("책제목을 입력해 주세요");
        //문자열 기능중에 공백 제거 기능이 있다. .trim(); " " +홍길동 + " "
        String title = scanner.nextLine();
        boolean isFind = false;
        // [] * 100 다 확인해봐야 한다.
        //["홍길동전"][]
        for (int i = 0; i < books.length; i++) {
            //.equals
            //0 ~ 5,
            // 방어적 코드
            if (books[i] != null) {
                //title.trim() <---공백 제거
                if (books[i].getTitle().equals(title.trim())) {
                    //찾았다면 출력됨
                    System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
                    isFind = true;
                    break;
                }
            }

        }
        //만약 책을 못 찾았다면 책을 출력해
        //isFind = false
        if (!isFind)
            System.out.println("해당 제목의 책은 존재 하지 않습니다.");
    }

    //전체 삭제하기 -배열안에 담겨 있는  book() 전부 null
    public static void diletAll(Book[] books) {
        System.out.println("---deleteAll----");
        for (int i = 0; i < books.length; i++)
            books[i] = null;

        //1. qoduf
        //전체 삭제중
        //readByTitle()에 Book[] books, Scanner scanner
        //String title = scneer.nextline()
        //title = null;
        //author = null;


    }

}
