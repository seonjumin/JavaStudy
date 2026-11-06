package start.method1;

public class MethodReturn1 {

    public static void main(String[] args){
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i){
        if(i % 2 == 1){
            return true;
        }else{
            return false;
        }
        //else부분이 없다면 메서드 실행시 return이 실행될 수 있는 상황이 없으므로 컴파일 오류가 난다.
    }
}
