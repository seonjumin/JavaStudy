package start.array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int max,min;

        System.out.println(count+"개의 정수를 입력하세요.");
        for(int i = 0; i<count; i++){
            numbers[i] = sc.nextInt();
            }

        min = numbers[0];
        max = numbers[0];
        
        for(int i = 1 ; i<count; i++){
            // 최소값
            if(numbers[i] < min){
                min = numbers[i];
            }
            // 최대값
            if(numbers[i] > max){
                max = numbers[i];
            }
//            else{
//                System.out.println("Exception!!!!");
//            }
        }
        System.out.println("가장 작은 정수: "+ min);
        System.out.println("가장 큰 정수: "+ max);
    }
}
