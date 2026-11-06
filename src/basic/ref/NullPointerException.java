package basic.ref;

public class NullPointerException {

    public static  void main(String[] args){
        //주소가 존재하지 않는 것을 가리킬때 발생함.
        //지역변수의 경우에는 null문제를 파악하는 것이 어렵지 않다.(멤버 변수일 경우 주의필요!)
        Data data = null;
        data.value = 10;
        System.out.println("data = "+data.value);
    }
}
