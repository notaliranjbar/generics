public class Accessory extends Product {
    private static int accIds = 1;
    private String colour;
    //setters and getters

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return this.colour;
    }
    //constructor
    public Accessory(String title , int price ,String colour) {
        super(title , price);
        this.colour = colour;
    }
    //methods
    public String toString(){
        return ("title" + this.getTitle() + "price" + this.getPrice() + "colour" + this.colour);

    }
    @Override
    protected String generateId() {
        int thisId = 3000 + accIds;
        accIds++;
        return Integer.toString(thisId);
    }
}
