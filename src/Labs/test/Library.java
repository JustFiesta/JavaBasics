package Labs.test;

import java.util.HashSet;

public class Library extends Exception implements CRUD {
    HashSet<Book> bookCollection = new HashSet<>();

    @Override
    public void AddBook(Book book) {
        try{
            bookCollection.add(book);
            System.out.println("Dodano książkę: " + book.title);
        }catch (Exception e){
            System.out.println("Ta książka już jest w bibliotece!");
        }
    }

    @Override
    public void RemoveBook(Book book) {
        bookCollection.remove(book);
        System.out.println("Usunięto książkę: "+ book.title);
    }

    @Override
    public void SearchBook(Book book) {
        if (bookCollection.contains(book)){
            System.out.println("W bibliotece mamy książkę " + book.title);
        }else {
            System.out.println("Niestety w bibliotece nie mamy książki " + book.title);
        }
    }
}
