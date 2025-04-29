import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main{
    public static void main(String[] args){
        Inventory inventory1 = new Inventory();
        Inventory inventory2 = new Inventory();
        Inventory inventory3 = new Inventory();
        Book book1 = new Book("shazdeKocholo" , 10 , "mamad" , "publicated" , "drama");
        NoteBook noteBook1 = new NoteBook("djls" , 12 , true , 100);
        NoteBook noteBook2 = new NoteBook("djlls" , 15 , false , 200);
        Accessory bracelet = new Accessory("gucci bracelet" , 20934 , "gold");
        inventory1.addItem(bracelet);
        inventory1.addItem(noteBook1);
        inventory2.addItem(noteBook2);
        inventory2.addItem(book1);
        inventory3.addItem(bracelet);
        inventory3.addItem(book1);
        /// //
        inventory1.displayAll();
        inventory2.displayAll();
        inventory3.displayAll();
        /// ///
        inventory1.removeItemById(3001);
        inventory2.removeItemById(2002);
        /// //
        System.out.println(calculateTotalPrice(inventory1));
        System.out.println(calculateTotalPrice(inventory2));
        System.out.println(calculateTotalPrice(inventory3));
        /// ///
        inventory1.findItemById(2001);
        inventory2.findItemById(2002);
        /// //
        inventory1.applyDiscount("djls" , 5);
        inventory2.applyDiscount("djlls" , 3);
        /// ////






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