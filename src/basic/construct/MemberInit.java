package basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가(멤버의 속성을 채워넣는 메서드)
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
//매개변수의 이름과 멤버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야 한다.
//this는 인스턴스 자신을 가리킨다.