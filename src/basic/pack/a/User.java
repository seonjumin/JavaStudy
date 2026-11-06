package basic.pack.a;

public class User {

    //public이 있어야 다른 패키지에서 이 클래스를 사용할 수 있다.
    public User(){
        System.out.println("패키지 pack.a 회원 생성");
    }
}
