package start.cond;

public class CondOp2 {
    public static void main(String[] args){
        int age = 18;
        String status = age >= 18? "성인": "미성년자";
        System.out.println("age = "+age+" status = "+status);

    }
}
//삼항 연산자 : if문에서 가정에 따라 status의 차이를 구하는 식이므로 status 변수 선언 후 식을 작성함.