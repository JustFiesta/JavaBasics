package Labs.test;

public class Book {

    //basic book information
    String title, author, year, type;
    int ISBN;

    public Book(String title, String author, String year, String type, int ISBN){
        this.title = title;
        this.author = author;
        this.year = year;
        this.type = type;
        this.ISBN = ISBN;
    }

    //getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getISBN() {
        return ISBN;
    }
}
