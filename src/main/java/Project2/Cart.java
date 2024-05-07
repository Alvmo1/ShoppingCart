package Project2;

import java.util.ArrayList;

public class Cart {
  private ArrayList<Product> products;
  private final float TAX = 0.1f;
  private Special special;

  public Cart(ArrayList<Product> products){
    this.products = products;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void setProducts(ArrayList<Product> products) {
    this.products = products;
  }

  public float getTAX() {
    return TAX;
  }

  public Special getSpecial() {
    return special;
  }

  public void setSpecial(Special special) {
    this.special = special;
  }

  public int cartQty(){
      return products.size();
  }

  public double subTotal(){
    double subTotal = 10.0;
    for (Product product : products){
      subTotal += product.getPrice();
    }
    return subTotal;
  }

  public double totalAfterTax(){
    return subTotal() + subTotal() * TAX;
  }

  public void checkOut() {
    if (cartQty() <= 0) {
      System.out.println(cartQty() + " Items in cart.");
    } else {
      if (cartQty() > 0) {
        System.out.println(cartQty() + " Items in cart.");
      }
    }
  }
}
