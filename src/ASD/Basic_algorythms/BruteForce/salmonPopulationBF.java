package src.ASD.Basic_algorythms.BruteForce;

public class salmonPopulationBF {
    static int time_C =0;
    static int minutes_to_pass = 12200;

    final static int starting_population = 1000000;
    static int current_population = 1000000;
    final static double power = 0.003;

    // Sharks consume this ratio per minute
    final static double shark_ratio = 0.002;
    // Salmons run away by this ratio per minute
    static double salmon_runaways_ratio = 0.002;

    public static void main(String[] args) {
        calculateSalmonPopulation(minutes_to_pass);
    }

    static void calculateSalmonPopulation(int time) {
        for (int t = 0; t < time; t++) {



            current_population -= current_population * shark_ratio;
            current_population -= current_population * salmon_runaways_ratio;

            current_population *= Math.exp(power);

            System.out.println("Populacja po upływie " + (t+1) + " minut" + ": " + current_population);

            time_C++;
            System.out.println("Ilość wywołań: " + time_C);

            if (current_population <= starting_population / 2 && current_population > starting_population / 3) {
                System.out.println("Populacja łososi spadła poniżej 1/2 miliona");
            } else if (current_population <= starting_population / 3 && current_population > starting_population / 10) {
                System.out.println("Populacja łososi spadła poniżej 1/3 miliona");
            } else if (current_population <= starting_population / 10 && current_population > starting_population / 100) {
                System.out.println("Populacja łososi spadła poniżej 1/10 miliona");
            } else if (current_population <= starting_population / 100 && current_population > 100) {
                System.out.println("Populacja łososi spadła poniżej 1/100 miliona");
            } else if (current_population <= 100) {
                System.out.println("Populacja łososi wyginęła");
                break;
            }
        }
    }
}
