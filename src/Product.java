public abstract class Product {
    private String title;
    private double price;
    private String Id;
    //setters and getters

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getId() {
        return Id;
    }
    public String getTitle() {
        return title;
    }
    //constructor
    public Product(String title, double price){
        this.title = title;
        this.price = price;
        this.Id = generateId();
    }
    protected abstract String generateId();


}
