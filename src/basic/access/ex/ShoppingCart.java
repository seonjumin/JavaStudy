package basic.access.ex;


public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    void addItem(Item item){

        if(itemCount >= 10){
            System.out.println("장바구니가 가득 찼습니다.");
        }else{
            items[itemCount] = item;
//            if(items[itemCount] != null) {
//                System.out.println("기존에 담긴 장바구니 아이템 갯수 : " + items[itemCount].getName());
//            }
            itemCount++;
//            System.out.println("현재 담긴 장바구니 아이템 갯수 : "+items[itemCount].getName());

        }
    }

//    void getCountCart(){
//        System.out.println("현재카트에는 "+itemCount+"개 있다.");
//    }
    void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;                               //제외
                        //배열만큼 돌리면 null값이 나온다.(items.length X)
        for(int i =0; i<itemCount;i++){
            System.out.println("상품명: "+items[i].getName()+", 합계: "+items[i].getTotalPrice());
            sum += items[i].getTotalPrice();    //제외
        }
        System.out.println("총 합계: "+sum);   //System.out.println("총 합계: "+calculateTotalPrice());

    }
//    private int calculateTotalPrice(){
//        int totalPrice = 0;
//        for(int i = 0; i < itemCount; i++){
//            totalPrice += items[i].getTotalPrice();
//        }
//        return totalPrice;
//    }
}
