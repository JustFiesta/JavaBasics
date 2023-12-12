package src.ASD.Basic_algorythms.rewindForTest;

import java.util.concurrent.ThreadLocalRandom;

public class calculateFigureMonteCarlo {
    static int trials = 100; // l. losowań

    public static void main(String[] args) {
        System.out.println(area(trials));
    }
    public static double area(int trials){
        ThreadLocalRandom randomPoint = ThreadLocalRandom.current();

        double x,y; // losowe punkty
        int count = 0; // liczba punktów spełniających warunek

        for (int i = 0; i < trials; i++){
            x = randomPoint.nextInt(trials + 1)/100.0;
            y = randomPoint.nextInt(trials + 1)/100.0;

            if (x >= 0.7 && y <= 0.3){
                count++;
            }
        }
        return (double) count/trials;
    }
}
