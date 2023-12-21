package src.ASD.Basic_algorythms.DynamicProgrammig;

public class salmonsTest {
    static double consumeRatio = 0.004;
    static int time = 2500;
    static int timePassedInMinutes = 0;
        // 0 - time = 1,
        // 0 - before, 1 - currentPopulation
//    static double currentPopulation = 1000.0;
    static double[] populationTable = {1000.0, 1000.0};
        public static double calculatePopulation(int timeInMinutes) {
            populationTable[1] = (populationTable[0] * Math.pow(3.14, 0.002)) - (populationTable[0] * consumeRatio);
            populationTable[0] = populationTable[1];
//            System.out.println("populacja: " + populationTable[1]);
//            System.out.println("czas: "+timeInMinutes);
//            if (populationTable[1] < 10) {
//                System.out.println("populacja spadla ponizej 10, populacja: "+populationTable+" w czasie: "+timeInMinutes);
//            }
            timeInMinutes--;
            timePassedInMinutes++;
            if (populationTable[1] < 10){
                return 0;
            }else {
                return calculatePopulation(timeInMinutes);
            }
        }

        public static void main(String[] args) {

            while (populationTable[1] > 10){
                calculatePopulation(time);
            }
            System.out.println("populacja spadla ponizej 10, populacja: "+populationTable[1]+" w czasie: "+timePassedInMinutes);
        }
}
