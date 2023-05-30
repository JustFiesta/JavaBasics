package Labs.no9.Zadanie3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String path;
        String dzien, miesiac, rok;

        System.out.println("Podaj ścieżkę zapisu plików: ");
        path = input.next();

        System.out.println("Podaj datę twoich urodzin (osobno dzień, miesiąc i rok)");
        System.out.println("*Dzień*");
        dzien = input.next();
        System.out.println("*Miesiąc*");
        miesiac = input.next();
        System.out.println("*Rok*");
        rok = input.next();


        
    }

}
