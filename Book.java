public class Book implements BookHandler{
    private int numPages;
    private String author;
    private BookPersistence bookPersistence;

    public Book(String author, int numPages){
     this.author = author;
     this.numPages =numPages;
     this.bookPersistence = new BookPersistence();
    }
    @Override
    public String toString(){
        return author + " - " + numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void print() {

    }

    @Override
    public void save(){
        bookPersistence.save(this);
    }
}
