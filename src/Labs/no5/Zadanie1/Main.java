package Labs.no5.Zadanie1;

import Labs.no5.Zadanie1.*;

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
        System.out.println(figure1.description());
        System.out.println(figure1.getColor());

        Rectangle rectangle1 = new Rectangle(5,12);
        System.out.println(rectangle1.getField());
        rectangle1.move(3,5);

        Triagnle triagnle1 = new Triagnle(5,5);

        Circle circle0 = new Circle(25);
        System.out.println(circle0.getField());
        System.out.println(circle0.inCircle(point3));

        Square square0 = new Square(5, "Pomarańczowy");
        System.out.println(square0.description());
        System.out.println(square0.getField());

        System.out.println(point1.description());
        System.out.println(figure1.description());
        System.out.println(rectangle1.description());
        System.out.println(triagnle1.description());
        System.out.println(circle0.description());
        System.out.println(square0.description());


    }
    public static int InputInt(){
        System.out.println("Wpisz liczbę: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }
}
