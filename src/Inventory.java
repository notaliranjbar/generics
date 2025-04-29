import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> products;
    //setters and getters

    //methods
    public void applyDiscount(String productName , int discount){
        for (T product : products){
            if(product.getTitle().equals(productName)){
                product.setPrice(product.getPrice()-discount);
            }
        }

    }

}
