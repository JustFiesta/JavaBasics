package ASD.Basic_algorythms.GreedyAlgorithms;

public class knapsackProblemGreedy {
    //greedy knapsack
    // 3 strategies: 1. W rosnąco, V malejąco, 2. W malejąco, V rosnąco, 3. W/V malejąco, V/W rosnąco
    // we can take items by weight up, value down or other wise. Or we can make quotient value/weigh or weight/value

    // ill try 3rd approach
    static int maxWeight = 10;
    static int items = 6;

    static int[] itemsV = {6,2,3,2,3,1}; // Vi - i item value
    static int[] itemsW = {6,4,5,7,10,2}; // Wi - i item weight
    static int[] itemChecker = new int[itemsV.length]; // if 1 at i index - i item is taken to knapsack

    public static void main(String[] args) {
        int currentWeight = 0;

        //bubble sort
        for (int j = 0; j < items; j++){
            for (int i = 1; i < items; i++) {
                //previous element
                double ratioP = (double) itemsV[i - 1] / itemsW[i - 1];
                //next element
                double ratioN = (double) itemsV[i] / itemsW[i];

                // previous < next
                if (ratioP < ratioN) { // sort both arrays in same way
                    //for value
                    int tmpV = itemsV[i];
                    itemsV[i] = itemsV[i - 1];
                    itemsV[i - 1] = tmpV;

                    //for weight
                    int tmpW = itemsW[i];
                    itemsW[i] = itemsW[i - 1];
                    itemsW[i - 1] = tmpW;

                }
            }
        }

        //show sorted items
        System.out.println("Sorted items");
        System.out.print("Value:");
        for (int value: itemsV) {
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.print("Weight:");
        for (int value: itemsW) {
            System.out.print(" " + value);
        }
        System.out.println();

        //pack the knapsack
        for (int i = 0; i < items; i++){
            if (currentWeight + itemsW[i] < maxWeight){
                itemChecker[i]++;
                currentWeight += itemsW[i];
            }
        }


        System.out.println("Obecna waga plecaka po zapakowaniu: " + currentWeight);
        System.out.print("Zapakowane itemki:");
        for (int num: itemChecker) {
            System.out.print(" " + num);
        }
    }
}
