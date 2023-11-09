package ASD.Basic_algorythms.DynamicProgrammig;

public class knapsackDynamic {
    //homework
    static int maxVolume = 10;
    static int items = 6;

    //Items data - Value and Weight
    static int[] V = {6,2,3,2,3,1};  // Vi - values
    static int[] W = {6,4,5,7,10,2};  // Wi - weights

//    we have given math formula for this problem
//        if (i == 0 && v < itemsVolume[i]){
//        return 0;
//    }
//        if (i == 0 && v >= itemsVolume[i]){
//        return itemsVValue[i];
//    }
//
//    //third formula scenario
//    int w1 = knapsack(i-1, v);
//        if (i > 0 && v < itemsVolume[i]){
//        return w1;
//    }
//
//    //last formula scenario
//    int w2 = itemsVValue[i] + knapsack(i-1, v - itemsVolume[i]);
//        if (w1 < w2){
//        return w2;
//    }else {
//        return w1;
//    }

    public static void main(String[] args) {

        int[][] backpackState = new int[items][maxVolume]; // table for all backpack states


        //two first formulas
        for (int i = 0; i < maxVolume; i++){ // first row and column completion
            if (i < V[0]) backpackState[0][i] = 0;
            else backpackState[0][i] = W[0];
        }
        // state after this code : 0, 0, 0, 0, 0, 0, 6?

        // two last formulas
        // for each to complete remaining cells
        for (int c = 1; c < items; c++){
            for (int r = 0; r < maxVolume; r++){ // for values rows
                if (r < V[c]) backpackState[c][r] = backpackState[c - 1][r]; //que passa amigo?
                else {
                    //max - 4 formula
                    int w1 = backpackState[c - 1][r];
                    int w2 = W[c] + backpackState[c - 1][r];

                    if (w1 > w2) backpackState[c][r] = w1;
                    else backpackState[c][r] = w2;
                }
            }
        }
        //Results
        System.out.println("v =\t0    1    2    3    4    5    6    7    8    9   10");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < items; i++)
        {
            System.out.print("i = " + i + "|");
            for (int j = 0; j < maxVolume; j++)
            {
                int val = backpackState[i][j];
                if (val<100) System.out.print(" ");
                if (val<10) System.out.print(" ");
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
    //completely unintuitional code tf - how am i supposed to understand this approach?
}
