package start.array.ex;

import java.util.Scanner;

public class ArrayEx7_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int students = sc.nextInt();

        sc.nextLine();

        System.out.print("과목이름을 입력하세요: ");
        String input = sc.nextLine();
        String[] subjects = input.split(" ");
        //System.out.println("subjects.length : "+subjects.length);
        int subjectCount = subjects.length;
        int[][] scores = new int[students][subjectCount];

        for(int i =0; i<students; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");
            for(int j=0; j<subjectCount; j++){
                System.out.print(subjects[j]+" 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<scores.length; i++){
            int sum = 0;
            for(int j=0; j<scores[i].length; j++){
                sum += scores[i][j];
            }
            double average = (double)sum/subjectCount;
            System.out.println((i+1)+"번의 학생의 총점: "+sum+", 평균: "+average);
        }





    }
}
