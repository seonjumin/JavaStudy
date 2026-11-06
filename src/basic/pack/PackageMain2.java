package basic.pack;
//(패키지 사용 편하게하기 - import)
import basic.pack.a.User; //import + 주소
// 패키지 안에 여러개의 클래스가 있고 그것들을 동시에 불러오고 싶을때는(basic.pack.a.*)

public class PackageMain2 {

    public static void main(String[] args){
        Data data = new Data(); //사용자랑 같은 위치
        User user= new User();  //사용자랑 다른 위치
    }
}
