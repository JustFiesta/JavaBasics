package no3;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Sprawdźmy czy twoje słowo jest palindromem");
        //Czytanie stringa
        Scanner sc = new Scanner(System.in);
        String palindrom = sc.nextLine();
        Palindrom(palindrom);

    }
    public static Boolean Palindrom(String str){

        //Pomocnicze naczynka
        char ch;
        String pali = "";
        int start = 0;

        //Odwracanie str do zmiennej pali - iteruje od tyłu
        for (int i = str.length()-1; i >= 0; i--){
            ch = str.charAt(i);
            pali = pali+ch;
        }
        boolean compare = Arrays.equals(str.toCharArray(), pali.toCharArray());
        if (compare == true){
            System.out.println("Twoje słowo jest palindromem");
            return true;
        }else {
            System.out.println("Niestety twoje słowo nie jest palindromem");
            return false;
        }
    }
}
