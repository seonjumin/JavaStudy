package basic.access.a;

public class PublicClassInnerMain {
        //같은 패키지이므로 호출가능
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
