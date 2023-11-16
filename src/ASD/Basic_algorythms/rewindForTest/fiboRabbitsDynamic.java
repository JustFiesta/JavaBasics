package src.ASD.Basic_algorythms.rewindForTest;

import java.util.ArrayList;
import java.util.Scanner;

public class fiboRabbitsDynamic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input months: ");
        int usrInput = input.nextInt();

        System.out.println("Rabbits after " + usrInput + " months: " + rabbits(usrInput) * 2);
    }
    public static int rabbits(int months){
        int[] rabbitStates = new int[months];

        rabbitStates[0] = 1;
        rabbitStates[1] = 1;

        for (int i = 2; i < months; i++){
            rabbitStates[i] = rabbitStates[i - 1] + rabbitStates[i - 2];
        }

        return rabbitStates[months-1];
    }
}
