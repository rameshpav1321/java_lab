package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public  void checkout(String status){
//        Logging
//        Authentication and authorization
//        Sanitize the data
        System.out.println("Checkout method from shopping cart called...");
    }
}
