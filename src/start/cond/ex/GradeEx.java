package start.cond.ex;

import java.util.Scanner;

public class GradeEx {
    public static void main(String[] args){

        while(true){
            System.out.println("학점을 입력하세요");
            System.out.print("grade:");
            Scanner sc = new Scanner(System.in);
            String grade = sc.next();
            switch(grade){
                case "A" :
                    System.out.println("탁월한 성과입니다!");
                    break;
                case "B" :
                    System.out.println("좋은 성과입니다.");
                    break;
                case "C" :
                    System.out.println("준수한 성과입니다.");
                    break;
                case "D" :
                    System.out.println("향상이 필요합니다.");
                    break;
                case "F" :
                    System.out.println("불합격입니다.");
                    break;
                default :
                    System.out.println("잘못된 학점입니다.");
            }
            System.out.println();
        }
    }
}
