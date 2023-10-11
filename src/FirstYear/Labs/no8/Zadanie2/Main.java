package FirstYear.Labs.no8.Zadanie2;

import java.util.*;

//hashmapy
public class Main {
    public static void main(String[] args) {

            final String noMoreNames = "-";
            String name, partnerName;

            //skoro unikalne imiona to set-y
            Map<String, String> names = new HashMap<>();
            Scanner input = new Scanner(System.in);

            do{
                System.out.println("Podaj imie: ");
                name = input.next();
                System.out.println("Podaj imię partnera: ");
                partnerName = input.next();
                if (!name.equals(noMoreNames) || !partnerName.equals(noMoreNames)) names.put(name, partnerName);
            }while(!name.equals(noMoreNames) || !partnerName.equals(noMoreNames));

            System.out.println("Unikalna liczba par imion wynosi: " + names.size());
    }
}
