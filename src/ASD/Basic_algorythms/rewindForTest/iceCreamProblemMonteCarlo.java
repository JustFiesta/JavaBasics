package src.ASD.Basic_algorythms.rewindForTest;

import java.util.concurrent.ThreadLocalRandom;

public class iceCreamProblemMonteCarlo {
    public static int[][] ice_cream = {
            //0   1   2   3   4   5
            { 0,  7, 20, 21, 12, 23},//0
            {27,  0, 13, 16, 46,  5},//1
            {53, 15,  0, 25, 27,  6},//2
            {16,  2, 35,  0, 47, 10},//3
            {31, 29,  5, 18,  0,  4},//4
            {28, 24,  1, 17,  5,  0} //5
    };
    public static void main(String[] args) {
        iceCreamFactory(10);
    }
    public static void iceCreamFactory(int trials) {
        int randomIndex;

        int[] timeArray = new int[trials];
        String[] orderArray = new String[trials];

        int maxFlavlours = 5;
        int[] flavourIndex = new int[maxFlavlours];

        int currentTime = 0;
        int currentIndex = 0;
        String currentOrder = "";

        for (int i = 0; i < trials; i++){
            System.out.println("Próba nr " + (i + 1));
            flavourIndex = new int[maxFlavlours];
//            int countFlavours = 0;
//            while (true){
//                randomIndex = ThreadLocalRandom.current().nextInt(maxFlavlours);
//
//                if (flavourIndex[randomIndex] == 0 && ice_cream[currentIndex][randomIndex] != 0){
//                    currentTime += ice_cream[currentIndex][randomIndex];
//                    System.out.println("Random index: " + randomIndex);
//                    System.out.println("Current Time:" + currentTime);
//
//                    flavourIndex[randomIndex] = 1;
//                    currentOrder += randomIndex;
//                    currentIndex++;
//                    countFlavours++;
//
//                    if (countFlavours >= 5){
//                        break;
//                    }
//                }
//            }

            for (int j = 0; j < maxFlavlours; j++){
                randomIndex = ThreadLocalRandom.current().nextInt(maxFlavlours);

                if (flavourIndex[randomIndex] == 0 && ice_cream[j][randomIndex] != 0){
                    currentTime += ice_cream[currentIndex][randomIndex];
                    System.out.println("Random index: " + randomIndex);
                    System.out.println("Current Time:" + currentTime);

                    flavourIndex[randomIndex] = 1;
                    currentOrder += randomIndex;
                    currentIndex++;
                }
            }

            timeArray[i] = currentTime;
            orderArray[i] = currentOrder;

            currentOrder = "";
        }

        int min = Integer.MAX_VALUE;
        int index;
        String minOrder = null;
        for (int i = 0; i < trials; i++){
            if (min > timeArray[i]){
                min = timeArray[i];
                minOrder = new String(orderArray[i]);
            }
        }
        System.out.println("Minimalny czas ze 100 prób: " + min);
        System.out.println("Kolejność lodów: " + minOrder);
    }
}
