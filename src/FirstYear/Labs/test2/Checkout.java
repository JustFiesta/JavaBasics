package FirstYear.Labs.test2;

import java.util.ArrayList;

public class Checkout implements OrderInterface{
    private static ArrayList<Product> basket;

    public Checkout(){
        basket = new ArrayList<>();
    }

    public static ArrayList viewBasket(){
        System.out.println(basket);
        return basket;
    }

    @Override
    public void addProduct(Product product) {
        basket.add(product);
    }

    @Override
    public void removeProduct(Product product) {
        basket.remove(product);
    }

}
