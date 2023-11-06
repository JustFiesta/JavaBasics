package src.ASD.Basic_algorythms.DynamicProgrammig;

public class salmonPopulationDynamic {
    static int time_C =0;
    static int minutes_to_pass = 12200;
    final static int starting_population = 1000000;
    static int current_population = 1000000;
    final static double power = 0.003;

    // Sharks consume this ratio per minute
    final static double shark_ratio = 0.002;
    // Salmons run away by this ratio per minute
    static double salmon_runaways_ratio = 0.002;

    static double[] populationArray = new double[minutes_to_pass + 1];

    public static void main(String[] args) {
        calculateSalmonPopulation(minutes_to_pass);
    }
    static void calculateSalmonPopulation (int time){

        populationArray[0] = starting_population;

        for (int i = 1; i < populationArray.length; i++){
            double newPopulation = populationArray[i - 1] - (populationArray[i - 1] * shark_ratio + populationArray[i - 1] * salmon_runaways_ratio);
            newPopulation = newPopulation * Math.exp(power);
            populationArray[i] = newPopulation;

            System.out.println("Populacja po upływie " + i + " minut: " + populationArray[i]);

            time_C++;
            System.out.println("Ilość wywołań: " + time_C);

            if (populationArray[i] <= starting_population / 2 && populationArray[i] > starting_population / 3) {
                System.out.println("Populacja łososi spadła poniżej 1/2 miliona");
            } else if (populationArray[i] <= starting_population / 3 && populationArray[i] > starting_population / 10) {
                System.out.println("Populacja łososi spadła poniżej 1/3 miliona");
            } else if (populationArray[i] <= starting_population / 10 && populationArray[i] > starting_population / 100) {
                System.out.println("Populacja łososi spadła poniżej 1/10 miliona");
            } else if (populationArray[i] <= starting_population / 100 && populationArray[i] > 100) {
                System.out.println("Populacja łososi spadła poniżej 1/100 miliona");
            } else if (populationArray[i] <= 100) {
                System.out.println("Populacja łososi wyginęła");
                break;
            }
        }
    }
}
