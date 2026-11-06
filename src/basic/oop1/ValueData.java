package basic.oop1;

public class ValueData {
    //데이터
    int value;

    //기능(메서드) - static을 사용하지 않는다.
    void add() {
        value++; // 자기자신의 데이터에 접근하므로 valueData.value라고 하지않아도 됨.
        System.out.println("숫자 증가 value=" + value);
    }
}
