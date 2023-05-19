package Labs.no6.Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jaką masz rangę?");
        Scanner input = new Scanner(System.in);
        String usrinput = input.next();

        WhitchRank(Ranks.valueOf(usrinput));

    }
    public static void WhitchRank(Ranks rank){
        switch (rank){
            case PRIVATE -> System.out.println("20 pompek szeregowy");
            case SARGENT -> System.out.println("20 przysiadów sierżancie");
            case COPORAL -> System.out.println("Salwa honorowa kapralu");
            case MAJOR -> System.out.println("Salut majorze");
        }
    }
}
