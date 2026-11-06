package basic.access.b;

//import basic.access.a.DefaultClass1;
//import basic.access.a.DefaultClass2;
import basic.access.a.PublicClass;
 //외부패키지에서 호출
public class PublicClassOuterMain {

    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        //import해서 사용가능.
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();
        //import를 해도 다른패키지에 있으므로 접근불가
    }
}
