package src.ASD.Basic_algorythms.rewindForTest;

public class quickestRoad {
    static int[][] ways = {
            {0  ,300,402,356,  0,  0,  0,  0,  0},
            {300,  0,  0,  0,440,474,  0,  0,  0},
            {402,  0,  0,  0,  0,330,  0,  0,  0},
            {356,  0,  0,  0,  0,  0,823,  0,  0},
            {  0,440,  0,  0,  0,  0,  0,430,  0},
            {  0,474,330,  0,  0,  0,813,365,774},
            {  0,  0,  0,823,  0,813,  0,  0,403},
            {  0,  0,  0,  0,430,365,  0,  0,768},
            {  0,  0,  0,  0,  0,774,403,768,  0}
    };
    public static void main(String[] args) {
        calculateWay(0, 8);
    }
    public static void calculateWay(int start, int end){
        int jurneyKm = 0;

        int minKm;

        int shortestPathIndex = 0;
        int currentCityIndex = start;
        while (currentCityIndex != end){

            minKm = Integer.MAX_VALUE;

            if (ways[currentCityIndex][end] > 0){ // jeżeli jest trasa bezpośrednia to jedźmy nią
                jurneyKm += ways[currentCityIndex][end];
                System.out.println("Trasa bezpośrednia zajmie: " + jurneyKm);
                break;
            }else { // jeżeli nie ma trasy to szukaj najkrótszej w każdym mieście dopóki nie znajdziesz trasy do punktu docelowego
                System.out.println("Miasto nr: " + currentCityIndex);
                for (int j = 0; j < ways.length; j++){
                    System.out.println("trasa do miejsca o nr: " + j);
                    if (minKm > ways[currentCityIndex][j] && ways[currentCityIndex][j] > 0 && j > currentCityIndex){
                        minKm = ways[currentCityIndex][j];
                        shortestPathIndex= j;
                        System.out.println("Obecne minimalne KM: " + minKm);
                    }
                }
                jurneyKm += minKm;
                currentCityIndex = shortestPathIndex;
            }
        }
    }
}
