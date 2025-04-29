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
    public void addItem(T product){
        products.add(product);
    }
    public void removeItemById(int id){
        for (T product : products){
            if(product.getId().equals(id)){
                products.remove(product);
            }
        }
    }


}
