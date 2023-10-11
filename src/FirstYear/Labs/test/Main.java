package FirstYear.Labs.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //nowa bibloteka
        Library library = new Library();

        //skaner dla wyboru użytkownika
        Scanner scanner = new Scanner(System.in);

        boolean ProgramRunType = true;

        while (ProgramRunType){
            System.out.println("====== Bibloteka =====");
            System.out.println("Wybierz opcję (1-4)");
            System.out.println("1 - dodaj książkę");
            System.out.println("2 - usuń książkę");
            System.out.println("3 - wyszukaj książkę");
            System.out.println("4 - wyjdź");

            int userChoice = scanner.nextInt();
            scanner.nextLine(); // pobiera pozostały znak -> dzięki temu nextline w switchu działają XD

            switch (userChoice){
                case 1:
                    System.out.println("Podaj tytuł książki:");
                    String title = scanner.nextLine();
                    System.out.println("Podaj autora książki:");
                    String author = scanner.nextLine();
                    System.out.println("Podaj rok wydania książki:");
                    int year = scanner.nextInt();
                    System.out.println("Podaj ISBN książki:");
                    String isbn = scanner.next();
                    System.out.println("Podaj gatunek książki:");
                    String userType = scanner.next();
                    //Jakiego typu?     Wybór(nazwaEnum.nazwaWybranegotypu) -> na drukowane
                    BookTypes type = BookTypes.valueOf(userType.toUpperCase());

                    Book newBook = new Book(title, author, year, type, isbn);
                    System.out.println("Udało się! Dodałeś nową książkę!");
                    break;
                case 2:
                    System.out.println("Podaj tytuł książki do usunięcia");
                    String titleToRemove = scanner.next();
                    //Najpierw sprawdź czy istnieje w bibliotece
                    Book bookToRemove = library.SearchBook(titleToRemove);
                    if (bookToRemove != null){
                        library.RemoveBook(bookToRemove);
                        System.out.println("Usunięto pomyślnie!");
                    }else{
                        System.out.println("Nie ma takiej książki w bibliotece");
                    }
                    break;
                case 3:
                    System.out.println("Który tytuł cię interesuje?");
                    String bookToSearch = scanner.next();
                    Book bookToFind = library.SearchBook(bookToSearch);
                    if (bookToFind != null){
                        System.out.println("Posiadamy tą książke na stanie");
                        System.out.println("Tytuł: " + bookToFind.getTitle());
                        System.out.println("Autor: " + bookToFind.getAuthor());
                        System.out.println("Rok wydania: " + bookToFind.getYear());
                        System.out.println("ISBN: " + bookToFind.getISBN());
                        System.out.println("Gatunek: " + bookToFind.getType());
                    }else {
                        System.out.println("Niestety nie posiadamy tej książki");
                    }
                    break;
                case 4:
                    System.out.println("Adios!");
                    ProgramRunType = false;
                    break;
            }
        }
    }
}
