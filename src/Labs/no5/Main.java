package Labs.no5;

import Labs.no5.Zadanie1.Figure;
import Labs.no5.Zadanie1.Point;
import Labs.no5.Zadanie1.Rectangle;
import Labs.no5.Zadanie1.Triagnle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5,7);
        Point point2 = new Point();
        Point point3 = new Point(10,26);

        point1.description("point1");
        point2.description("point2");
        point2.move(-5,-2);
        point2.description("point2");
        point3.tare();
        point3.description("point3");

        Figure figure1 = new Figure();
        figure1.description();
        figure1.getKolor();

        Rectangle rectangle1 = new Rectangle(5,12);
        rectangle1.getPowierzchnia();

        Triagnle triagnle1 = new Triagnle(5,5);


    }
    public static int InputInt(){
        System.out.println("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }
}
