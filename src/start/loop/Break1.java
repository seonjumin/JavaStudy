package start.loop;

public class Break1 {
    public static void main(String[] args){
       //1부터 차례대로 더하여 합이 10보다 크게 되는때를 구하라.
        int num = 1;
        int sum = 0;
//        while(true){
//            sum = sum + num;
//            num++;
//            if(sum >= 10){
//                System.out.println("num = "+num+" sum = "+sum);
//                break;
//            }
//        }
        for(int i = 1; ; i++){ //증감식을 비워두면 무한반복이다.
            sum = sum + i;
            if(sum > 10){
                System.out.println("합계가 10보다 큼 : "+ sum + ", i = "+ i);
                break;
            }
        }
    }
}
