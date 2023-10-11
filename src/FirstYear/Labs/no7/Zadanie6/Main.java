package FirstYear.Labs.no7.Zadanie6;

import java.util.Scanner;

//wyjdź poza tablicę
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj ile indeksów ma mieć tablica");
        int arrIndex = InputInt();
        int[] adiosArray = new int[arrIndex];
        for (int i = 0; i < arrIndex; i++){
            adiosArray[i] = InputInt();
        }
        System.out.println("Do którego indeksu chcesz się odwołać?");
        int usrChoice = InputInt();

        while (true) {
            try {
                System.out.println("Oto zawartość indeksu " + usrChoice + ": " + adiosArray[usrChoice]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Troche wyjechałeś poza tablicę, jest maksymalnie " + adiosArray.length + " indeksów");
            }
        }
    }
    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        return input.nextInt();
    }
    
}
