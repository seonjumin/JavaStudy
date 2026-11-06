package basic.oop1;

public class ValueObjectMain {

    public static void main(String[] args){
        //객체지향(속성과 기능 따로 분리 후 사용)
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자="+ valueData.value);
    }
}
