package Labs.no8.Zadanie1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// zbiory (set)
public class Main {
    public static void main(String[] args) {

        final String noMoreNames = "-";
        String name;

        //skoro unikalne imiona to set-y
        Set<String> names = new HashSet<>();
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Podaj imie: ");
            name = input.next();
            if (!name.equals(noMoreNames)) names.add(name);
        }while(!name.equals(noMoreNames));

        System.out.println("Unikalna liczba imion wynosi: " + names.size());
    }
}
