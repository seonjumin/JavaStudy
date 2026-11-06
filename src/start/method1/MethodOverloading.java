package start.method1;

public class MethodOverloading {

    public static void main(String[] args){
        System.out.println(add(2,4));
        System.out.println(add(4,6,7));
        System.out.println(add(3.4, 5.6));
        myMethod(1, 1.2);
        myMethod(1.2, 1);

    }
    //메서드 시그니처  :   이름(매개변수 타입(순서))
    public static int add(int a , int b){
        return a + b;
    }
//    public static int add(int b, int a){
//        return b+a;
//    }                                 //오류.
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(double a, double b){
        return a + b;
    }

    // 실행 동작이 더하는 거라서 모든 메서드의 이름을 add라고 정하고 싶은데
    // int를 더하던 double을 더하던 add메서드였으면 좋겠고
    // 2개를 더하던 3개를 더하던 add메서드였으면 좋겠을 때 사용함.

    //그러나 매개변수는 같고 반환값만 다르게 하는것은 불가능하다.

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }
    public static void myMethod(double b, int a){
        System.out.println("double b, int a");
    }
            //매개변수의 타입의 순서가 달라서 가능함.
}
