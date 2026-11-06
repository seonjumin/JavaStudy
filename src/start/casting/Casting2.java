package start.casting;

public class Casting2 {
    public static void main(String[] args){
        double doubleValue = 1.5;
        int intValue = (int) doubleValue;
        //int형의 intValue라는 그릇에 int모양으로 바꾼 doubleValue를 넣는다.
        // -> 개발자들이 임시수치를 간단히 확인하고싶은 경우에 사용함.
        System.out.println(intValue);
        System.out.println(doubleValue);
        //doubleValue의 숫자를 바꾼것이 아니라서 doubleValue의 값이 변하는것은 아니고
        // int형으로 형태만 바꿔 intValue에 넣은것이므로
        //intValue의 값은 1
        //doubleValue의 값은 여전히 1.5이다.
    }
}
