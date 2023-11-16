package src.ASD.Basic_algorythms.rewindForTest;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class guessingGame {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Wymyśl liczbę do odgadnięcia");

        guessNum(0, 1001);
    }
    public static void guessNum(int minBound, int maxBound){
        int randomNum = (minBound + maxBound - 1) / 2;

        System.out.println("Czy ta liczba to: " + randomNum);

        String usrInput = input.next();

        if (usrInput.equals("tak")){
            System.out.println("Zgadłem! Ta liczba to: " + randomNum);
            System.exit(1);
        } else if (usrInput.equals("mala")) {
            guessNum(randomNum, maxBound);
        } else if (usrInput.equals("duza")) {
            guessNum(minBound, randomNum);
        } else {
            System.out.println("Podaj poprawną odpowiedź (tak/za duza/za mala)");
            guessNum(minBound, maxBound);
        }
    }
}