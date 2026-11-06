package start.cond;

public class If5 {
    public static void main(String[] args){
        int price = 10000;
        int age = 15;
        int discount = 0;


        if(price >= 10000){
            discount += 1000;
        }

        if(age <= 10){
            discount += 1000;
        }
        System.out.println("총 할인금액 : "+discount);
        int total = price - discount;
        System.out.println("총 결제금액 : "+total);

    }
}
