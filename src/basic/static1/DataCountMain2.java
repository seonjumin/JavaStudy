package basic.static1;

public class DataCountMain2 {

    public static void main(String[] args){
        //새로운 객체를 생성할때마다 그 수를 세아림.
        Counter counter = new Counter();
        //Counter 인스턴스를 공용으로 사용한 덕분에 객체를 생성할때마다 값이 증가함.
        Data2 data1 = new Data2("A",counter);
        System.out.println("A count= " + counter.count);

        Data2 data2 = new Data2("B",counter);
        System.out.println("B count= " + counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C count= " + counter.count);
    }
}
//불편한 점
//Data2 클래스와 관련된 일인데, Counter라는 별도의 클래스를 추가로 사용해야 한다.
// 생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
