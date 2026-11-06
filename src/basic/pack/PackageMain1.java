package basic.pack;

public class PackageMain1 {

    public static void main(String[] args){
        Data data = new Data(); //사용자랑 같은 위치
        basic.pack.a.User user= new basic.pack.a.User();  //사용자랑 다른 위치(사용하기 불편)
    }
}
//'pack'패키지와 'pack.a'패키지, 'pack.b'패키지는 모두 서로 다른 패키지이다.
//pack아래에 pack.a와 pack.b가 있다고 pack과 pack.a가 같은 소속이라고 오해하면 안된다.
//서로 다른 패키지이므로 pack패키지에서 pack.a패키지 안에 있는 클래스를 사용할 경우
//import를 꼭 사용해야한다.