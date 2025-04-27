public class Book extends Product{
    private static int bookIds = 1;
    private String author;
    private String publication;
    private String genre;
    //constructor
    public Book(String title , double price ,String author , String publication , String genre) {
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
    //methods
    @Override
    protected String generateId(){
        int thisId = 1000 + bookIds;
        bookIds++;
        return Integer.toString(thisId);
    }
    public String toString(){
        return ("title : " + this.getTitle() + ", price : " + this.getPrice() + ", author : " + this.getAuthor() + ", genre : " + this.getGenre());
    }

}
