package Labs.no7.Zadanie1;
<<<<<<< HEAD
//Połączenie z bazą danych
//1. nowy projekt
//2. pobranie sqlite-jbc lub inne
//3. File>Project structure>Project Setting>Modules>DependenciesKlikamy + >Jar  or  Directory
//4. kopia poniższego kodu do maina (na konsoli po odpaleniu powinno być „Opened database  successfully”)
import java.sql.*;public class Main {public static void main( String args[] ) {Connection c = null;try {Class.forName("org.sqlite.JDBC");c = DriverManager.getConnection("jdbc:sqlite:test.db");} catch ( Exception e ) {System.err.println( e.getClass().getName() + ": " + e.getMessage() );System.exit(0);}System.out.println("Openeddatabase successfully");}}
=======

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        zadanie1();
    }
    public static void zadanie1(){
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        double userInput = 0;

        while (true) {
            try {
                userInput = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                scanner.next();
            }
        }
        if (userInput < 0 ){
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczbt rzeczywistej %.4f nie istnieje! ", userInput));
        }
        System.out.print(String.format("Pirwiastek z %.4f = %.4f", userInput, Math.sqrt(userInput)));
    }
}
>>>>>>> origin/master
