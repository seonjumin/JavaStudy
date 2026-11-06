package start.variable;

public class Var2 {

    public static void main(String[] args){
        int a; //a라는 그릇.
        a = 10; //그릇에 10을 넣음.

        System.out.println(a);

        int b;
        //System.out.println(b);
        //지역변수는 초기화를 무조건 시켜줘야함. -> 공간을 차지하지만 값이 없으면 원하지 않는 값이 나올 수 있음.
        //클래스변수,인스턴스변수는 자동으로 초기화를 해줌.
    }
}
