package basic.com.helloshop.order;

import basic.com.helloshop.product.Product;
import basic.com.helloshop.user.User;

public class OrderService {

    public void order(){
        User user = new User();             //다른 패키지라서 import
        Product product = new Product();    //다른 패키지라서 import
        Order order = new Order(user, product); //같은 패키지라서 import 안함

    }
}
