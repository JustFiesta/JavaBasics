package ASD.Basic_algorythms.BruteForce;

public class IceCreamTestAndGen {
    // generete all permutations of some set of nums
    final static int N = 6; // permutacje n-elementowe
    final static int[][] loudy = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {28, 24, 1, 17, 5, 0}
    };
    private static int[] l = new int[N];

    public static void main(String[] args) {
        permutacje(0);
    }

    static void permutacje(int i) {

        int minVal = 1000;
        int currentVal = 0;

        if (i == N) {
            for (int j = 0; j < N; j++) {
                System.out.print(l[j] + " ");
            }
            System.out.println();
        } else {

            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (l[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }
}
