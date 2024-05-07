package Project2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Fries("Al",Size.L,2.0,1));


        Cart cart = new Cart(products);
        cart.subTotal();

        User user = new User(cart);
        user.addToCart(new Fries("Al",Size.M,2.0,1));
        cart.checkOut();
        for(Product product : cart.getProducts()){
            System.out.println(product.getName());
        }
        System.out.println(cart.cartQty());




    }
}
