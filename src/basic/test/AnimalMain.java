package basic.test;

public class AnimalMain {

    public static void main(String[] args){
        Dog dog = new Dog();
        Animal animal = new Animal();
        //Dog dog2 = new Animal();
        Animal animal2 = new Dog();
        Object obj = new Animal();
        Object obj2 = new Dog();
        //Animal animal3 = new Object();
        //생성된 객체가 낮은 타입을 가질 수는 없다.
        //하위 클래스의 인스턴스가 생성될때 상위클래스의 모든 객체가 같이 생성된다.

    }
}
