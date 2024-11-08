package pkg13_Cart;

import java.util.Arrays;

public class CartEx {

  public static void main(String[] args) {
    
    Cart cart = new Cart(5);
    
    cart.addProduct(new Product("포카칩", 1700));
    cart.addProduct(new Product("무드등", 25000));
    cart.addProduct(new Product("토마토", 17000));
    cart.addProduct(new Product("디퓨저", 19000));
    cart.addProduct(new Product("카메라", 170000));
    
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    for(int i = 0; i < cart.getIdx(); i++) {
      System.out.println(cart.getProducts()[i].getName());
      System.out.println("  " + cart.getProducts()[i].getPrice());
    }
      
   
   }

}
