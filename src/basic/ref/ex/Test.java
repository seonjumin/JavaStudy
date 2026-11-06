package basic.ref.ex;

public class Test {
    public static void main(String[] args){
        ProductOrder order1 = createOrder("두부",2000,2);
        ProductOrder order2 = createOrder("김치",5000,1);
        ProductOrder order3 = createOrder("콜라",1500,2);
        ProductOrder[] orders = {order1, order2, order3};

        printOrder(orders);
        getTotalAmount(orders);

    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrder(ProductOrder[] orders){
        for(int i =0; i<orders.length; i++){
            System.out.println("상품명: "+ orders[i].productName + ", 가격: "+orders[i].price+", 수량: "+orders[i].quantity);
        }
    }
    static void getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for(int i =0; i<orders.length; i++){
            sum += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액: "+sum);
    }
}
