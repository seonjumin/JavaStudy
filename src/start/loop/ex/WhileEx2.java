package start.loop.ex;

public class WhileEx2 {
    public static void main(String[] args){
        int num = 2;
        int count = 0;
        while(count < 10){
            System.out.println(num);
//            num += 2;
            num *= 2;
            count++;
            //System.out.println("num : "+num+ " count : "+count);
        }
    }
}
