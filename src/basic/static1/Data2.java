package basic.static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter){
                            //정의하는 단계이므로 import가 필요없고 말 그대로 Counter타입의 counter라는 변수를 넣는것이다.
        this.name = name;
        counter.count++;
        //Counter 클래스의 멤버변수인 count를 사용할수있게된것.(Counter클래스안에 없는것은 사용불가)
    }
}
