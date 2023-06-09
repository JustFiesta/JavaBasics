package Labs.test;

public interface CRUD {
     void AddBook(Book book);
     void RemoveBook(Book book);
     // lub do 1 pomysłu
     //void SearchBook(Book book);
     Book SearchBook(String title);

}
