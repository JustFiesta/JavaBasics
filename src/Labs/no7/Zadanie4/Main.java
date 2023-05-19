package Labs.no7.Zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do spierwiastkowania: ");
        int usrInput = InputInt();
        double rootFromInput = Math.sqrt(usrInput);

        System.out.println("Oto pierwiastek liczby "+usrInput+": "+rootFromInput);
    }
    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}

