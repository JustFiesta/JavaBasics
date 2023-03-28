package Labs.no4.Zadanie1;

public class Circle {
    String name;
    double radius;
    static final double pi = Math.PI;
    public double Field(double radius){
        return pi * (Math.pow(radius, 2));
    }
    public double Circut(double radius){
        return 2 * pi * radius;
    }
    public void Params(){
        System.out.println("Wybrana figura: "+this.getName());
        System.out.println("Promień koła wynosi: "+this.getRadius());
        System.out.println("Pole wynosi: "+this.Field(radius));
        System.out.println("Obwód wynosi: "+this.Circut(radius));
    }

    public String getName() {
        return name;
    }
    public double getRadius() {
        return radius;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
