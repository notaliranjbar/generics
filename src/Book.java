public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
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

}
