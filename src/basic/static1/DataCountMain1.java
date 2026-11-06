package basic.static1;

public class DataCountMain1 {

    public static void main(String[] args){
        //새로운 객체를 생성할때마다 그 수를 세아림.

        //new로 새롭게 객체가 생성될때마다 새로운 인스턴스가 생성되므로 count는 계속 1이다.
        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count);
    }
}
