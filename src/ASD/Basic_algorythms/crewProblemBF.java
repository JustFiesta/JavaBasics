package src.ASD.Basic_algorythms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class crewProblemBF {
    //We need to print all posible permutations of given numbers (for ex. we have 4 nums)

    //Brute force attempt:
    public static void main(String[] args) {
        //cosmonauts and their traits
        String[] cosmonautList = {"AD", "BD", "BC", "AB", "CD"};
        String bestComibnation = "";

        //basic collection permutation
        for (int k1 = 0; k1 <= 1; k1++){
            for (int k2 = 0; k2 <= 1; k2++){
                for (int k3 = 0; k3 <= 1; k3++){
                    for (int k4 = 0; k4 <= 1; k4++){
                        for (int k5 = 0; k5 <= 1; k5++){
                            if (k1 == 1){
                                System.out.print("Dodano kosmonautę nr 1\n");
                                bestComibnation+=cosmonautList[0];
                            }
                            if (k2 == 1){
                                System.out.print("Dodano kosmonautę nr 2\n");
                                bestComibnation+=cosmonautList[1];
                            }
                            if (k3 == 1){
                                System.out.print("Dodano kosmonautę nr 3\n");
                                bestComibnation+=cosmonautList[2];
                            }
                            if (k4 == 1){
                                System.out.print("Dodano kosmonautę nr 4\n");
                                bestComibnation+=cosmonautList[3];
                            }
                            if (k5 == 1){
                                System.out.print("Dodano kosmonautę nr 5\n");
                                bestComibnation+=cosmonautList[4];
                            }

                            System.out.println("Wybrana kombinacja cech kosmonautów: " + bestComibnation);

                            char[] traits = bestComibnation.toCharArray();
                            Arrays.sort(traits);
                            String sortedTraits = new String(traits);

                            if (sortedTraits.equals("ABCD")){
                                System.out.println("(1 - wybrano kosmonautę, 0 - nie wybrano)");
                                System.out.println("k1: " + k1 + "\n"
                                        + "k2: " + k2  + "\n"
                                        + "k3: " + k3  + "\n"
                                        + "k4: " + k4  + "\n"
                                        + "k5: " + k5 );
                                System.exit(1);
                            }else {
                                bestComibnation = "";
                            }
                        }
                    }
                }
            }
        }
    }
}
