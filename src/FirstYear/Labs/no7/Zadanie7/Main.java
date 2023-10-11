package FirstYear.Labs.no7.Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę do działania: ");
        int a = input.nextInt();
        System.out.println("Podaj dzielnik przerwszej liczby: ");
        int b = input.nextInt();

        try {
            int result = Divide(a, b);
            System.out.println("sus");
        }catch (DivisionByZero ex){
            System.out.println("Wyjątek: "+ex.getMessage());
        }

    }
    public static int Divide(int a, int b) throws DivisionByZero {
        if (b == 0) {
            throw new DivisionByZero();
        }
        return a / b;
    }

}
