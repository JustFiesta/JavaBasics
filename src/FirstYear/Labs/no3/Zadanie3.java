package FirstYear.Labs.no3;

import static FirstYear.Labs.no3.Zadanie1.InputInt;

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println("Ile wyrazów ma mieć ciąg?");
        final int row = InputInt();
        int[] arrayRow = new int[row];

        InputInArray(arrayRow);
        EvenInArray(arrayRow);
    }
    public static int[] InputInArray(int[] array){
        int i = 0;
        while (i < array.length){
            System.out.println("Podaj kolejny wyraz ciągu: ");
            array[i] = InputInt();
            i++;
        }
        return array;
    }
    public static void EvenInArray(int[] array){

        int sumEven = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sumEven += array[i];
            }
        }
        System.out.println("Suma liczb parzystych: "+sumEven);
    }
}
