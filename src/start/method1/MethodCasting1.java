package start.method1;

public class MethodCasting1 {

    public static void main(String[] args){
        double number = 1.5;
        printNumber((int)number); //명시적 형변환을 이용해 double을 int로 변환하여 대입.
    }
    public static void printNumber(int n){
        System.out.println("숫자: "+ n);

    }
}
