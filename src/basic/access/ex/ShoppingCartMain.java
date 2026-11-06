package basic.access.ex;

public class ShoppingCartMain {

    public static void main(String[] args){
        int a = 10;
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘",2000,2);
        Item item2 = new Item("상추",3000,4);

        System.out.println(cart);
        System.out.println(item1);
        System.out.println(item2);



        cart.addItem(item1);
        cart.addItem(item2);

//        cart.getCountCart();

        cart.displayItems();
    }
}
