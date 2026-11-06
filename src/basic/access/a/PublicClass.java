package basic.access.a;

public class PublicClass {
    //class안에 여러가지 클래스를 만들 수 있다.
    //그러나 public이 붙는 클래스는 단 한개여야하고
    // 그 클래스는 파일명과 동일해야 한다.
    //클래스에 사용되는 접근제어자 : public, default
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
class DefaultClass1{
}
class DefaultClass2{

}
