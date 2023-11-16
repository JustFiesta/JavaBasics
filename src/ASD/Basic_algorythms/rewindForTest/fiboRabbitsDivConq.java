package src.ASD.Basic_algorythms.rewindForTest;

import java.util.Scanner;

public class fiboRabbitsDivConq {
    public static void main(String[] args) {
        int rabbits = 1; // one pair of newborn rabbits

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę miesięcy: ");
        int usrInput = input.nextInt();

        if (usrInput <= 0){
            System.out.println("Nie można zacząć od miesiąca ujemnego");
            System.exit(1);
        }

        System.out.println("Liczba królików po " + usrInput + " miesiącach: " + rabbits(usrInput) * 2);
    }
    public static int rabbits(int month){
        if (month == 1 || month == 2){
            return 1;
        }else {
            return rabbits(month - 1) + rabbits(month - 2);
        }
    }
}
