package basic.ref;

public class MethodChange1 {

    public static void main(String[] args){
        int a = 10;
        System.out.println("메서드 호출 전: a = "+a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = "+a);

    }
    //메서드에 파라미터로 a의 값을 빌려줄뿐이지 a 그 자체를 넣는것이 아니다.
    public static void changePrimitive(int x){
        x = 20;
        //System.out.println(x);
    }
}
