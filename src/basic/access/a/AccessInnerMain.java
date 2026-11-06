package basic.access.a;

public class AccessInnerMain {

    public static void main(String[] args){
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가능(내부에서만 접근가능하니까)
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
        // innerAccess안에 private이 들어있더라도
        // innerAccess메서드는 public이므로 접근가능하다.
        // innerAccess메서드는 내부에 있는 private에 접근 할 수 있다.

    }
}
