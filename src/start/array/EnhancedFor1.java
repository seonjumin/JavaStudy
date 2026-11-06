package start.array;

public class EnhancedFor1 {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            //System.out.println(number);
        }

        //향상된 for문, for-each문
            //int number라는 변수 생성 / numbers는 numbers라는 배열의 처음부터 끝까지를 탐색하는 뜻.->탐색하여 int number변수에 넣음.
        for(int number : numbers){
            System.out.println(number); // 값이 넣어진 number변수를 출력함.
        }
    }
}
