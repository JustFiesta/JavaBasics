package Labs.no4.Zadanie1;

import java.util.Scanner;

public class Main {
    public static <pi> void main(String[] args) {

        //Menu
        System.out.println("Jaką figurę chcesz policzyć?");
        String choice = InputString();

        switch (choice){
            case "Koło":
                System.out.println("Podaj promień koła");
                double radius = InputDouble();
                Circle circle = new Circle();
                circle.Params(radius);
                break;

            case "Kwadrat":
                System.out.println("Koło");
                break;

            case "Prostokąt":
                System.out.println("Koło");
                break;

            case "Sześcian":
                System.out.println("Koło");
                break;

            case "Prostopadłościan":
                System.out.println("Koło");
                break;

            case "Kula":
                System.out.println("Koło");
                break;

            case "Stożek":
                System.out.println("Koło");
                break;

        }
    }
    //Pobieranie info od uzytkownika
    public static String InputString(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public static double InputDouble(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
