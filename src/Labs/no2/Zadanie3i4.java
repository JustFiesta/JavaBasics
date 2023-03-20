package Labs.no2;
import java.util.Scanner;

//Użycie tablic
public class Zadanie3i4 {
    public static void main(String[] args) {


    }

    public static float InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        float z = input.nextFloat();
        return z;
    }

    public static int[] returnArray() {
        final int arrayLen = 10;
        int[] arrayInt = new int[arrayLen];
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) InputInt();
        }
        return arrayInt;
    }

    public static void viewArray(int[] array) {
        System.out.println("\nElementy tablicy: ");
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static void viewReverse(int[] array) {
        System.out.println("\nOdwrócone elementy: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void viewEven(int[] array) {
        System.out.println("\nParzyste elementy: ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i % 2 == 0)
                System.out.print(array[i] + " ");
            continue;
        }
    }

    public static void viewOdd(int[] array) {
        System.out.println("\nNieparzyste elementy: ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i % 2 == 1)
                System.out.print(array[i] + " ");
            continue;
        }
    }
    public static void arraySum(int[] array){
        System.out.print("\nSuma elementów: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.print(sum);
    }
}