package basic.ref;

public class NullMain1 {

    public static void main(String[] args){
        Data data = null;
        System.out.println("1. data = "+data);

        data = new Data();
        System.out.println("2. data = "+data);

        data = null;  //Data 인스턴스를 더이상 참조하지 않는다.
        System.out.println("3. data = "+data);

        //가비지 컬렉션에 들어가게 됨.

        //이름은 같지만 다른 주소로 새롭게 생성.
        data = new Data();
        System.out.println("4. data = "+data);



    }
}
