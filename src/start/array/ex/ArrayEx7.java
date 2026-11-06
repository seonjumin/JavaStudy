package start.array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        int sum=0;
        double avg= 0.0;
        for(int i=0; i<4; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");
            for(int j=0; j<3; j++){
                if(j==0){
                    System.out.print("국어 점수:");
                    students[i][j] = sc.nextInt();
                }else if(j==1){
                    System.out.print("영어 점수:");
                    students[i][j] = sc.nextInt();
                }else if(j==2){
                    System.out.print("수학 점수:");
                    students[i][j] = sc.nextInt();
                }else{
                    System.out.println("Exception!!!");
                }
                sum += students[i][j];

            }
            avg = (double)sum/3;
            System.out.println((i+1)+"번 학생의 총점: "+sum+", 평균: "+ avg);
            sum = 0;
        }
    }
}
