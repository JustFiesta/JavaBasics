package src.ASD.Basic_algorythms.rewindForTest;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class coinProblemMonteCarlo {
    static final int trials = 100;
    static final int coinLimit = 11; // limit wydanych monet
    static int minCoinsInChange =  coinLimit; // najmniejsza liczba monet w próbach
    static final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    static final int[] limitPerCoin = {1, 0, 0, 0, 2, 2, 5, 2, 1}; // 13,49PLN
    static int[] coinsGiven = new int[coinLimit]; // wydane monety dla danej próby
    static int[] bestCoinsGiven = new int[coinLimit]; // najlepsze rozwiązanie

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int zl = input.nextInt();
        int gr = input.nextInt();

        System.out.println("Podaj resztę do wydania: ");
        giveChange(trials, zl, gr);
    }
    public static void giveChange(int trials, int zl, int gr){
        ThreadLocalRandom random = ThreadLocalRandom.current();

        int randomCoin;

        for (int i = 0; i < trials; i++){

            int change = zl * 100 + gr; // reszta do 100

            int coinsSpent = 0; // licznik wydanych monet

            while (coinsSpent <= coinLimit && change > 0){
                randomCoin = M[random.nextInt(M.length)]; // wylosuj monetę z tablicy monet

                if (change >= randomCoin){
                    change -= randomCoin;
                    coinsGiven[coinsSpent] = randomCoin; // dopisz wylosowaną monetę do tablicy wydawanych monet
                    coinsSpent++;
                }

                // znajdź najlepsze rozwiązanie
                if (coinsSpent < minCoinsInChange) { // jezeli wydalismy mniej monet niz w limicie to jest to nowe najlepsze rozwiązanie

                    minCoinsInChange = coinsSpent;

                    for (int j = 0; j < coinsSpent; j++){
                        bestCoinsGiven[j] = coinsGiven[j];
                    }
                }
            }
        }
        //Jesli najlepsze rozwiazanie (sposrod generowanych losowo) miesci sie w limicie monet ...
        if (minCoinsInChange < coinLimit)
        {
            // ... wypisz je
            System.out.print("Reszta: ");
            for (int i = 0; i < minCoinsInChange; i++)
                System.out.print(bestCoinsGiven[i] / 100.0 + " ");
        }
        else // w przeciwnym przypadku ...
            System.out.print("Nie znaleziono rozwiazania.");
        System.out.println();
    }
}
