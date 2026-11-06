package start.method1;

public class Overloding {

    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1.2, 3.4));
    }

//    public static int add(int a, int b){
//        return a + b;
//    }
        // int에서 double로는 자동 형변환이 가능하므로
    // 만약 int형 메서드가 없을 경우 double 메서드로 자동 적용된다.
    public static double add(double a, double b){
        return a + b;
    }
}
