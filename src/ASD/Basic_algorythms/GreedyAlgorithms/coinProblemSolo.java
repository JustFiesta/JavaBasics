package src.ASD.Basic_algorythms.GreedyAlgorithms;

import java.util.Scanner;

public class coinProblemSolo {
    public static void main(String[] args) {
        //input classes
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj resztę: ");
        System.out.println("- złotówki:");
        int pln = input.nextInt(); //whole zlotes

        System.out.println("- grosze:");
        int pennies = input.nextInt(); //well - pennies

        int[] coinNominals = {700, 300, 100, 50, 20, 10, 7, 4, 1}; //nominals of each coin - div by 100 gives nominal of coin used
        int[] coinLimit = {1, 2, 1, 5, 8, 0, 10, 3, 6}; //each index represents coin amout from coinsDenomination on same index

        //change and iterator
        int change, i = 0;

        //calculate change we have to give - pln * 100 bcs its our value in coinNominals + pennies - this will give whole sum if we div it by 100
        change = pln * 100 + pennies;

        System.out.println("Pozostała reszta: " + change);

        int[] coinsInChange = new int[coinNominals.length];

        // while we have change, and still have nominals to give
        System.out.println("Wydawane monetki: ");
        while(change > 0 && i < coinNominals.length) {
            if (change >= coinNominals[i] && coinLimit[i] > 0 ){ // if change is bigger than nominal to subtract and coin is available

                System.out.print(coinNominals[i] / 100.0 + " "); // have to div by 100 to get human read nominal
                change = change - coinNominals[i]; // now subtract this coin value

                coinsInChange[i]++; // subtraction is made, add one to coin amount on exact same index
                coinLimit[i]--;// subtraction is made, so we have one penny less
            }else {
                i++; // move on to another coin nominal
            }
        }
        System.out.println();
        System.out.println("Pozostała reszta: " + change / 100.0);
    }
}
