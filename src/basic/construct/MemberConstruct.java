package basic.construct;
        //생성자
public class MemberConstruct {
    String name;
    int age;
    int grade;
            //생성자는 메서드와 비슷하지만 차이가 있다.
            //* 생성자의 이름은 클래스의 이름과 같아야한다. 따라서 첫 글자도 대문자이다.
            //* 생성자는 반환 타입이 없다. 비워두어야한다.
            //* 나머지는 메서드와 같다.
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade; //grade 점수를 입력할 필요가 있다면 이 생성자를 사용.
    }
    //추가(오버로딩)
    MemberConstruct(String name, int age){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = 50; //grade는 데이터를 받지않고 항상 50
    }
    //변경 [this()] - 생성자 내부에서 다른 생성자 호출하여 중복 제거
//    MemberConstruct(String name, int age){
//        this(name, age, 50);  -> 첫줄에서만 사용가능.
//    }
}
