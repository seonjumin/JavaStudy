package basic.pack;

//동일한 이름 다른 패키지 import불가
import basic.pack.a.User;
//import basic.pack.b.User;(불가)

public class PackageMain3 {

    public static void main(String[] args){
        User userA = new User();
        basic.pack.b.User userB = new basic.pack.b.User();
        //주소를 따로 적어줘야함.import 불가
    }
}
