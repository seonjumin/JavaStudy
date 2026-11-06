package basic.static2;

public class DecoMain2 {

    public static void main(String[] args){
        //객체 생성조차 불필요.
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before : "+ s);
        System.out.println("after : "+ deco);
    }
}
