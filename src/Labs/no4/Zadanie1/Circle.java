package Labs.no4.Zadanie1;

public class Circle {
    static final double pi = Math.PI;
    int radius;

    public static double Field(double radius){
        double field = pi * (Math.pow(radius, 2));
        return field;
    }
    public static double Circut(double radius){
        double circut = 2 * pi * radius;
        return circut;
    }
    public static void Params(double radius){
        System.out.println("Wybrana figura: Koło");
        System.out.println("Promień koła wynosi: "+radius);
        System.out.println("Pole wynosi: "+Field(radius));
        System.out.println("Obwód wynosi: "+Circut(radius));
    }
}
