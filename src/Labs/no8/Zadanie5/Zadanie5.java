package Labs.no8.Zadanie5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        for (int i = 0; i<=5; i++){
            System.out.println("Podaj liczbe do zapełnienia listy");
            lista1.add(input.nextInt());
        }

        List<Integer> lista2 = new ArrayList<>();

        //tworzenie iteratora
        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());

        System.out.println(lista1);
        while (iterator.hasPrevious()){
            // zmienna lokalna dopiero przechodzi
            int element = iterator.previous();
            lista2.add(element);
        }
        System.out.println("Druga lista");
        System.out.println(lista2);
    }
}
