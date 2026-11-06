package start.loop;

public class DoWhile1 {
    public static void main(String[] args){
       int i = 10;
       do{

           System.out.println("현재 숫자는 : "+i);
           i++;
       }while(i < 3);

        System.out.println(i);
       switch(i){
           case 10 : System.out.println("에이");
           break;
           case 11 : System.out.println("비");
           break;
           case 12 : System.out.println("씨");

       }
    }
}


