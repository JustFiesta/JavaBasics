package src.ASD.Basic_algorythms.DivideAndConquer;

public class knapsackDC {
    //my profesor made a formula for knapsack problem -> Div and Conq is baisicly applying this recursive formula when it has atmonic steps

    static int MaxVolume = 20;
    static int items = 6;

    final static int[] itemsVolume = {6, 2, 3, 2, 3, 1}; // V - obj
    final static int[] itemsVValue = {6, 4, 5, 7, 10, 2}; // W - wartość

//    P(i, v) - item num (1-6), max Volume
    static int knapsack(int i, int v){
        if (i == 0 && v < itemsVolume[i]){
            return 0;
        }
        if (i == 0 && v >= itemsVolume[i]){
            return itemsVValue[i];
        }

        //third formula scenario
        int w1 = knapsack(i-1, v);
        if (i > 0 && v < itemsVolume[i]){
            return w1;
        }

        //last formula scenario
        int w2 = itemsVValue[i] + knapsack(i-1, v - itemsVolume[i]);
        if (w1 < w2){
            return w2;
        }else {
            return w1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Wartosc przedmiotow z plecaka: " + knapsack(items - 1, MaxVolume));
    }
}
