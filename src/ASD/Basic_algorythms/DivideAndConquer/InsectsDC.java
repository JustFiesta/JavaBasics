package src.ASD.Basic_algorythms.DivideAndConquer;

public class InsectsDC {
    public static void main(String[] args) {
        int weeks = 0;
        InsectsDC main = new InsectsDC();

        while (true) {
            int[] population = main.calculatePopulation(weeks);
            int males = population[0];
            int females = population[1];

            if (males >= females) {
                System.out.println("Po " + weeks + " tygodniach liczba samców przekroczy lub zrówna się z liczbą samic.");
                System.out.println("Liczba samców: " + males);
                System.out.println("Liczba samic: " + females);
                System.out.println("Łączna liczba owadów: " + (males + females));
                break;
            }

            weeks++;
        }
    }

    private int[] calculatePopulation(int weeks) {
        int initialPopulation = 1000;
        int males = 450;
        int females = 550;
        double reproductionRate = 0.15;
        double maleMortalityRate = 0.02;
        double femaleMortalityRate = 0.05;

        for (int i = 0; i < weeks; i++) {
            int newOwads = (int) (initialPopulation * reproductionRate);
            int newMales = (int) (newOwads * 0.47);
            int newFemales = newOwads - newMales;

            males += newMales - (int) (males * maleMortalityRate);
            females += newFemales - (int) (females * femaleMortalityRate);
        }

        return new int[]{males, females};
    }
}
