package basic.construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        //객체를 만듦과 동시에 생성자를 이용해서 속성 채워넣기
        //생성자 : new 생성자이름(생성자에 맞는 인수 목록)
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (int i = 0; i < members.length; i++) {
            MemberConstruct s = members[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        //***생성자 장점
        // 중복 호출 제거 : 원래라면 객체 생성 후 메서드를 한번 더 호출하여 데이터를 넣어야하지만 그럴 필요가 없어짐.
        // 적절한 제약 - 생성자 호출 필수 : 혹시나 메서드를 호출하지 않아 데이터누락이 일어날 수 있다 그땐 아무런 오류가 없이 그냥 데이터가 없는 유령이됨
        //그러나 생성자를 사용하게 될때 누락한다면 컴파일 오류가 나서 알려줌.
    }
}
