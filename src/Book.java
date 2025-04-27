public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    //constructor
    public Book(String title, double price) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    //setters and getters
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublication() {
        return publication;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    protected void generateId(){

    }

}
