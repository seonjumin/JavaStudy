package basic.oop1;

public class ValueDataMain {

    public static void main(String[] args){
        //절차지향
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자="+ valueData.value);
    }
    //데이터만 따로 분리, 메서드는 내부에 같이 존재
    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }
}
