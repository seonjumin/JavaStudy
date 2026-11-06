package start.loop;

public class While2_2 {
    public static void main(String[] args){
        int i = 1;
        int endNum = 10;  //숫자대신 공식을 넣고싶으면 새로운 변수를 만들어서 거기에 공식을 집어넣으면 되나?
                            // or while(true)로 만들고 그 안에 if문의 조건(가정)을 삽입함. ex)Break1
        int sum = 0;
        while(i<=endNum){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
