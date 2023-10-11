package FirstYear.Labs.no7.Zadanie4;

import java.util.InputMismatchException;
import java.util.Scanner;

//samodzielnie
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        double usrInput = 0;

        for (int i = 0; i == 0; ) {
            try {
                usrInput = input.nextInt(); //ten błąd będzie łapać
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj prawidłową liczbę!");
                input.next(); // i zrobi z nim to
            }
            if (usrInput < 0) {
                throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby " + usrInput + " nie stnieje!"));
            }
        }
        System.out.println("Oto pierwiastek liczby " + usrInput + ": " + Math.sqrt(usrInput));
    }
}

