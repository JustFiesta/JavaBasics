package src.ASD.Basic_algorythms.rewindForTest;

import java.util.Arrays;

public class crewProblemGreedy {
    static String[] cosmonautList = {"AD", "BD", "BC", "AB", "CD"};
    static String combination = "";
    public static void main(String[] args) {
        for (int i = 0; i < cosmonautList.length; i++) {
            for (int j = 1; j < cosmonautList.length; j++){
                if (i == j){
                    break;
                }

                combination += cosmonautList[i] + cosmonautList[j];
                char[] chars = combination.toCharArray();

                Arrays.sort(chars);

                combination = new String(chars);

                if (combination.equals("ABCD")){
                    System.out.println("Wybrano kosmonautów nr: " + (i+1) + " oraz " + (j+1));
                }else {
                    combination = "";
                }
            }
        }
    }
}
