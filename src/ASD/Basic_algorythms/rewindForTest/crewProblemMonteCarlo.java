package src.ASD.Basic_algorythms.rewindForTest;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class crewProblemMonteCarlo {
    static String[] cosmonautList = {"AD", "BD", "BC", "AB", "CD"};
    static String combination = "";
    public static void main(String[] args) {
        while (true){
            int randomIndex1 = ThreadLocalRandom.current().nextInt(5);
            int randomIndex2 = ThreadLocalRandom.current().nextInt(5);

            if (randomIndex1 != randomIndex2){
                combination += cosmonautList[randomIndex1] + cosmonautList[randomIndex2];

                char[] chars = combination.toCharArray();

                Arrays.sort(chars);

                combination = new String(chars);

                if (combination.equals("ABCD")){
                    System.out.println("Wybrano kosmonautów nr: " + (randomIndex1 + 1) + " oraz " + (randomIndex2 + 1));
                    break;
                }
                combination="";
            }
        }
    }
}
