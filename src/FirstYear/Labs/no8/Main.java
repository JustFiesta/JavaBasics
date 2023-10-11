package FirstYear.Labs.no8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> Linkedlist = new LinkedList<>();
        List<String> ArrayList = new ArrayList<>();

        // dodawanie nowych obiektów
        Linkedlist.add("Marek");
        Linkedlist.add("Karol");

        ArrayList.add("Janina");
        ArrayList.add("Ewelina");

        ArrayList.addAll(Linkedlist);

        // wyświeltanie obiektów
        System.out.println(ArrayList.contains("Marek"));
        System.out.println(ArrayList.get(3));
        // wyświetlenie kolejno: pierwszego wystąpienia i ostatniego obiektu o danej nazwie
        System.out.println(ArrayList.indexOf("Marek"));
        System.out.println(ArrayList.lastIndexOf("Marek"));

        // metody do kolekcji
        // przemieszczanie się po kolekcji
        System.out.println("For each: ");
        for (String object : ArrayList) {
            System.out.println(object + " ");
        }

        System.out.println("For: ");
        for (int i = 0; i < ArrayList.size(); i++){
            System.out.println(ArrayList.get(i));
        }

        //wypisanie bez pętli
        System.out.println("Wypisanie za pomocą nazwy kolekcji" + ArrayList);


        // zbiory (set) - mają unikalne wartości
        Set<String> setExample = new HashSet<>();
        setExample.add("Fifonż");

        // mapy (hashmap) - klucze się nie duplikują <klucz, wartość>
        Map<String, String> mapExample = new HashMap<>();
        // dodanie pary - klucz, wartość (działa to jak stos -> "pop, push")
        mapExample.put("Jan", "janina");
        mapExample.put("1", "janina1");
        mapExample.isEmpty();
        //ograniczenia: w kolekcjach nie można używać typów primytywnych: int, float, double, bolean, itd.
        // zamiast nich używamy obiekty: Integer, String, Double

    }
}
