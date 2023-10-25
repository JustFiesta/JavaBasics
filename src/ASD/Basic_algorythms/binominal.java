package ASD.Basic_algorythms;

public class binominal {
    //divide and conquer
    //dany jest ciąg liczbowy
    public static void main(String[] args) {
        System.out.println("dla 5 i 3");
        System.out.println(Newton(5, 3));
    }
    public static int Newton(int n, int k){
        if (k == 0 || k == n){
            return 1;
        }
        return Newton(n-1, k-1) + Newton(n-1, k);
    }
}
