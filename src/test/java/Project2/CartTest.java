package Project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    Cart cart;
    @BeforeEach
    public void setUpBeforeEach(){
        ArrayList<Product> products = new ArrayList<>();
        cart = new Cart(products);
    }

    @Test
    public void subTotalTest() {
        ArrayList<Product> products = new ArrayList<>();
        Cart cart = new Cart(products);
        double expected = 10.0;
        double actual = cart.subTotal();
        assertEquals(expected, actual);

    }
}