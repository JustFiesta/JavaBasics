package Labs.no7.Zadanie1;
//Połączenie z bazą danych
//1. nowy projekt
//2. pobranie sqlite-jbc lub inne
//3. File>Project structure>Project Setting>Modules>DependenciesKlikamy + >Jar  or  Directory
//4. kopia poniższego kodu do maina (na konsoli po odpaleniu powinno być „Opened database  successfully”)
import java.sql.*;public class Main {public static void main( String args[] ) {Connection c = null;try {Class.forName("org.sqlite.JDBC");c = DriverManager.getConnection("jdbc:sqlite:test.db");} catch ( Exception e ) {System.err.println( e.getClass().getName() + ": " + e.getMessage() );System.exit(0);}System.out.println("Openeddatabase successfully");}}
