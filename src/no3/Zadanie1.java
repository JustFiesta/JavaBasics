package no3;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę uczniów: ");
        int pupils = InputInt();

        System.out.print("Podaj liczbę punków dla każdego ucznia\n");
        int[] points = new int[pupils];

        int i = 0;
        while (i < pupils){
            System.out.println("Podaj punkty ucznia "+(i+1)+": ");
            points[i] = InputInt();
            i++;
        }
        System.out.println("Średnia ilość punktów w klasie to: "+Avg(points));
    }
    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int Avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;

        return avg;
    }
}
