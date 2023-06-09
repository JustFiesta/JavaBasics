package Labs.test;

import java.util.HashSet;

public class Library extends Exception implements CRUD {

    //prywatne pole kolekcji do przechowywania książek
    private HashSet<Book> bookCollection;

    //konstruktor biblioteki
    public Library(){
        bookCollection = new HashSet<>();
    }

    @Override
    public void AddBook(Book book) {
        try{
            bookCollection.add(book);
            System.out.println("Dodano książkę: " + book.getTitle());
        }catch (Exception e){
            System.out.println("Ta książka już jest w bibliotece!");
        }
    }

    @Override
    public void RemoveBook(Book book) {
        bookCollection.remove(book);
        System.out.println("Usunięto książkę: "+ book.getTitle());
    }
//1 pomysł - nie zwraca obiektu
//    @Override
//    public void SearchBook(Book book) {
//        if (bookCollection.contains(book)){
//            System.out.println("W bibliotece mamy książkę " + book.getTitle());
//        }else {
//            System.out.println("Niestety w bibliotece nie mamy książki " + book.getTitle());
//        }
//    }
// 2 pomysł - zwraca obiekt
    @Override
    public Book SearchBook(String title) {
        //for every Book object in bookCollection
        for (Book book : bookCollection) {
            if (book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Ta książka jest w bibliotece");
                return book;
            }else {
                System.out.println("Niestety nie ma takiej książki");
            }
        }
        return null;
    }

}
