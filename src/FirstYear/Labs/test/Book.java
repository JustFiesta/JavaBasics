package FirstYear.Labs.test;

import java.util.Scanner;

public class Book {

    //podstawowe informacje o książce (jako że nie uwzględniam rozróżniania gatunków )
    private String title, author;
    private int year;
    private String ISBN;
    private BookTypes type;

    //konstruktor książki
    public Book(String title, String author, int year, BookTypes type, String ISBN){
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
        try {
            this.type = type;
        }catch (Exception e){
            System.out.println("Podaj poprawny gatunek książki (FANTASY, " + "SCI_FI, " + "ROMANS, " + "HISTORYCZNE, " + "HORROR, " + "BIOGRAFIA, " + "DRAMAT)");
            Scanner input = new Scanner(System.in);
            this.type = BookTypes.valueOf(input.next());
        }


    }

    //getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(BookTypes type) {
        this.type = type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public BookTypes getType() {
        return type;
    }

    public String getISBN() {
        return ISBN;
    }
}
