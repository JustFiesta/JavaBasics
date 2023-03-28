package Labs.no4.Zadanie1;

import Lab.no4.Zadanie1.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Menu
        System.out.println("Jaką figurę chcesz policzyć?");
        String choice = InputString();

        switch (choice){
            case "koło" :
                System.out.println("Podaj promień koła");
                double radius = InputDouble();

                Circle circle = new Circle();
                circle.setRadius(radius);
                circle.setName(choice);
                circle.Params();
                break;

            case "kwadrat":
                System.out.println("Podaj podstawe kwadratu");
                double base = InputDouble();

                Square square = new Square();
                square.setBase(base);
                square.setName(choice);
                square.Params();
                break;

            case "prostokąt":
                System.out.println("Podaj podstawę prostokąta");
                base = InputDouble();
                System.out.println("Podaj bok prostokąta");
                double side = InputDouble();

                Rectangle rectangle = new Rectangle();
                rectangle.setBase(base);
                rectangle.setSide(side);
                rectangle.setName(choice);
                rectangle.Params();
                break;

            case "Sześcian":
                System.out.println("Podaj podstawę sześcianu");
                base = InputDouble();

                Cube cube = new Cube();
                cube.setBase(base);
                cube.setName(choice);
                cube.Params();
                break;

            case "Prostopadłościan":
                System.out.println("Podaj podstawę prostopadłościanu");
                base = InputDouble();
                System.out.println("Podaj bok prostopadłościanu");
                side = InputDouble();
                System.out.println("Podaj wysokość prostopadłościanu");
                double height = InputDouble();

                Cuboid cuboid = new Cuboid();
                cuboid.setBase(base);
                cuboid.setSide(side);
                cuboid.setHeight(height);
                cuboid.setName(choice);
                cuboid.Params();
                break;
//
//            case "Kula":
//                System.out.println("Podaj promień koła");
//                double radius = InputDouble();
//                Circle circle = new Circle();
//                circle.setRadius(radius);
//                circle.setName(choice);
//                circle.Params();
//                break;
//
//            case "Stożek":
//                System.out.println("Podaj promień koła");
//                double radius = InputDouble();
//                Circle circle = new Circle();
//                circle.setRadius(radius);
//                circle.setName(choice);
//                circle.Params();
//                break;

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
