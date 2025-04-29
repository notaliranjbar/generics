import java.util.ArrayList;

public class Main{
    public static void Main(String[] args){

    }
    public static double calculateTotalPrice (Inventory<? extends Product> inventory){
        double sum = 0;
        ArrayList<Double> prices = new ArrayList<>();
        prices = inventory.getProdctsPrices();
        for (Double price : prices){
            sum += price;
        }
        return sum;


    }
}