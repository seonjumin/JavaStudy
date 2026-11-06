package start.method1;

public class Method1 {
    public static void main(String[] args){
//        int a =1;
//        int b =2;
//        System.out.println(a + "+"+ b + "연산 수행");
//        int sum1 = a + b;
//        System.out.println("결과1 출력: " + sum1);

        int sum1 = add(1,2);
        System.out.println("결과1 출력: " + sum1);

        int sum2 = add(50, 10);
        System.out.println("결과2 출력:" + sum2);

        String sum3 = name("가현", "apfhd");
        System.out.println(sum3);

        add(100, 200);  //반환값은 출력하지않고 메서드 실행만 하는 것.

    }
    public static int       add      (int a, int b){
          //정적메서드 //반환타입 / 메서드이름   /파라미터 목록(매개변수)
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a+b;
        return sum;
    }
    public static String name(String a, String b){
        String hello = a + b;
        return hello;
    }

}
