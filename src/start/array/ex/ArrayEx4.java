package start.array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
                //형변환 중요!!
                        //정수들의 계산이라 소수점 뒤가 날라간뒤 double형으로 변한다.
                        //그러므로 계산할때부터 double형으로 계산을 해야 소수점 부분이 날아가지 않음.
        average = (double)sum/numbers.length;
        System.out.println("입력한 정수의 합계 : "+ sum);
        System.out.println("입력한 정수의 평균 : "+ average);




    }
}
