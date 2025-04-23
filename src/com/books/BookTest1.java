package com.books;

/**
 * 배열 테스트
 */
public class BookTest1 {

    public static void main(String[] args) {

        // 배열안에 요소는 -기본데이터 타입
        //                 - 참조형 타입

        Book[] books = new Book[10];//인덱스의 길이는 9까지
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘로");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유빌하라리");
        books[9] = new Book("홍길동전", "허균");


        //조회
        String title = books[9].getTitle();
        String author = books[9].getAuthor();

        System.out.println("title9 : " + title);
        System.out.println("author : " + author);

        //배열은 반복문자 함께 많이 쓰임
        //주의 !! 배열에 길이 안에 요소 (elements)는 가득 차있는 것은 아니다.
        for (int i = 0; i < books.length; i++) {
            //만약 배열안에 요소가 null이 아니라면 출력해 -방어적 코드 작성
            if (books[i] != null) {
                //null이 아닐때만 출력
                System.out.println(books[i].getTitle());
            }

        }

    }//end of main
}
