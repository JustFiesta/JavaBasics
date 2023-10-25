package ASD.Basic_algorythms.DynamicProgrammig;

public class binominalDynamic {
    //tablica dwuwymiarowa na stany
    //rekurencja -> zmiana na pętle
    //wzor do zaimplementowania: (n nad k) = 1                          dla k=0 lub k=n,
    //                                      (n-1 nad k-1) + (n-1 nad k) dla 0<k<n

    static int[][] arrayForStates = new int[6][6];

    public static void main(String[] args) {
        newton(5, 3);
    }
    public static void newton(int n, int k){
        for (int i = 1; i < arrayForStates.length; i++){
            for (int j = 1; j < arrayForStates.length; j++){
                if (i == j){
                    arrayForStates[i][j] = 1;
                } else if (i < j) {
                    //regarding to our formula we have to skip those where k > n (it has to be 0 < k < n)
                    System.out.print("s" + "\t");
                    continue;
                } else {
                    arrayForStates[i][j] = arrayForStates[i - 1][j - 1] + arrayForStates[i - 1][j];
                }
                System.out.print(arrayForStates[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
