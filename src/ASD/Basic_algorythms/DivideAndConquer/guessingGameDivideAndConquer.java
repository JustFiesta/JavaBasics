package ASD.Basic_algorythms.DivideAndConquer;

import java.util.concurrent.ThreadLocalRandom;

public class guessingGameDivideAndConquer {
//    zad a6 - komputer gra sam ze sobą, wypisuje propozycje, komunikaty itd.
    static final int numToGuess = randomNumGen(0, 1000);
    public static void main(String[] args) {
        System.out.println("Wymyśliłem liczbę, spróbuj ją zgadnąć");

        guessNum(0, 1000);

    }

    public static void guessNum(int minBound, int maxBound){
        int randomNum = randomNumGen(minBound, maxBound);
        System.out.println("Czy to jest liczba " + randomNum);

        int result = isCorrect(numToGuess, randomNum);

        if (result == 1){
            System.out.println("ZGADŁEM!");
        } else if (result == 0) {
            guessNum(randomNum, maxBound);
        }else if (result == 9) {
            guessNum(minBound, randomNum);
        }
    }
    public static int isCorrect(int numToGuess, int randomNum){
        if (numToGuess == randomNum){
            System.out.println("TAK");
            return 1;
        } else if (numToGuess > randomNum) {
            System.out.println("ZA MAŁA");
            return 0;
        } else if (numToGuess < randomNum){
            System.out.println("ZA DUŻA");
            return 9;
        }
        return 999;
    }
    public static int randomNumGen(int minBound, int maxBound){
        int randomNum;
        return randomNum = ThreadLocalRandom.current().nextInt(minBound, maxBound);
    }
}
