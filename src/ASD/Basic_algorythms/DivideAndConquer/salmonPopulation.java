package src.ASD.Basic_algorythms.DivideAndConquer;

public class salmonPopulation {
    static int minutes_to_pass = 12200;
    static int minutes_passed = 0;

    final static int starting_population = 1000000;
    static double current_population = 1000000;
    final static double power = 0.003;

    // Sharks consume this ratio per minute
    final static double shark_ratio = 0.002;
    // Salmons run away by this ratio per minute
    final static double salmon_runaways_ratio = 0.002;

    public static void main(String[] args) {
        System.out.println(calculateSalmonPopulation(minutes_to_pass));
    }
    static double calculateSalmonPopulation(int time) {
        // it is also a time complexity
        minutes_passed++;

        current_population -= current_population * shark_ratio;
        current_population -= current_population * salmon_runaways_ratio;

        System.out.println("Ilość wywołań: " + minutes_passed);
        System.out.println("Populacja po upływie " + (minutes_passed) + " minut" + ": " + current_population);

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
            System.exit(1);
        }

        current_population = calculateSalmonPopulation(time - 1) * Math.exp(power);

        return current_population;
    }
}
