package start.cond.ex;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args){

        int[][] movieList = {
            //순서,평점
                {1,9}, // 1.인셉션
                {2,6}, // 2.토이스토리
                {3,6}, // 3.토토로
                {4,3}, // 4.귀멸의 칼날
                {5,10},// 5.위대한 쇼맨
                {6,8}  // 6.뷰티플 마인드
        };

        // N평점을 입력 받아 같은 평점을 찾아 전체 출력! N는 6이다.


        // 1.키보드에서 숫자 입력 받아 변수에 저장하기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");
        int n = sc.nextInt();
        System.out.println(n);

        // 2. movieList 전부 출력하기
        System.out.println(movieList);

    }
}
