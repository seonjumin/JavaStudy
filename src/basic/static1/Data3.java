package basic.static1;

public class Data3 {
    public String name;
    public static int count; //static(멤버 변수) = new로 생성없이 클래스이름에 .붙여서 바로 사용가능/ 어디서든

    public Data3(String name){
        this.name = name;
        count++;
    }
}
//static이 붙은 멤버변수는 힙영역(붕어빵)이 아닌 메서드 영역(붕어빵틀)에서 관리된다.
//그래서 호출할때 static이 없는 name변수는 인스턴스명에 붙고 static이 있는 count는 클래스명에 붙어서 사용된다.
//클래스는 메서드영역(붕어빵틀)에 한개만 존재하고
//인스턴스는 힙영역(붕어빵)에 여러개가 존재가능함.

