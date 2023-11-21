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
    static String[] cities = {"Warszawa", "Katowice", "Zakopane", "Lwów", "Wiedeń", "Budapeszt", "Bukareszt", "Zagrzeb"};

    public static void main(String[] args) {
        calculateWay(0, 8);
    }
    public static void calculateWay(int start, int end){
        int jurneyKm = 0;

        int minKm;
        String cityOrder = "";

        int shortestPathIndex = 0;
        int currentCityIndex = start;
        while (currentCityIndex != end){
            cityOrder += cities[currentCityIndex] + ", ";
            minKm = Integer.MAX_VALUE;

            if (ways[currentCityIndex][end] > 0){ // jeżeli jest trasa bezpośrednia to jedźmy nią
                jurneyKm += ways[currentCityIndex][end];
                break;
            }else { // jeżeli nie ma trasy to szukaj najkrótszej w każdym mieście dopóki nie znajdziesz trasy do punktu docelowego
                for (int j = 0; j < ways.length; j++){
                    if (minKm > ways[currentCityIndex][j] && ways[currentCityIndex][j] > 0 && j > currentCityIndex){
                        minKm = ways[currentCityIndex][j];
                        shortestPathIndex= j;
                    }
                }
                jurneyKm += minKm;
                currentCityIndex = shortestPathIndex;
            }
        }
        System.out.println("Trasa wyniesie: " + jurneyKm + "km. Przystanki: " + cityOrder);
    }
}
