package start.loop;

public class Continue1 {
    public static void main(String[] args){
        //1부터 5까지 차례대로 출력하는데 3은 출력되지않게 하라.
        for(int i = 1; i <= 5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
