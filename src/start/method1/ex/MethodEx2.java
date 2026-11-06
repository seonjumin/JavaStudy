package start.method1.ex;

public class MethodEx2 {

    public static void main(String[] args){
        printMessage("Hello, world!",10);
    }

    public static void printMessage(String message, int times){
        for(int i = 1; i <= times; i++){
            System.out.println(i+"번 : " + message);
        }
    }
}
