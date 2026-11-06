package basic.static1;

public class DataCountMain3 {

    public static void main(String[] args){
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count+ " : "+data1.name);
                                        //클래스의 변수가 아닌 클래스에 바로 접근.

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count+ " : "+data2.name);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count+ " : "+data3.name);

        //추가
        //인스턴스를 통한 접근(가능함)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);//권장X
        //인스턴스에 있는 count를 사용하는것이 아니고 static영역으로 가서 사용함.

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
