package start.casting;

public class Casting3 {
    public static void main(String[] args){
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //아무리 값이 int에 들어갈수있는 값이더라도
                                      //long에 담겨있으므로 int로 형변환을 해주어야한다.
        System.out.println("maxIntValue start.casting= "+ intValue);
    }
}
