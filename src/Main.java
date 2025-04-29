import java.util.ArrayList;

public class Main{
    public static void Main(String[] args){
        Inventory inventory1 = new Inventory();
        Inventory inventory2 = new Inventory();
        Inventory inventory3 = new Inventory();
        Book book1 = new Book("shazdeKocholo" , 10 , "mamad" , "publicated" , "drama");
        NoteBook noteBook1 = new NoteBook("djls" , 12 , true , 100);
        NoteBook noteBook2 = new NoteBook("djls" , 15 , false , 200);
        Accessory bracelet = new Accessory("gucci bracelet" , 20934 , "gold");



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