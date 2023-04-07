package Labs.no5.Zadanie1;

import static Labs.no5.Main.InputInt;

public class Circle extends Figure{
    double radius;
    int x, y;

    public Circle(){
        this.radius = 0;
        this.punkt = new Point();
    }
    public Circle(double radius){
        this.radius = radius;
        System.out.println("Podaj współrzędne środka koła: ");
        this.x = InputInt();
        this.y = InputInt();
        this.punkt = new Point(x, y);
    }
    public double getField(){
        return Math.pow(this.radius,2) * ( Math.PI);
    }
    public double getDiameter(){
        return this.radius*2;
    }
    public boolean inCircle(Point randomPoint){
        if (Math.pow((punkt.getX() - randomPoint.getX()),2)+Math.pow((punkt.getY() - randomPoint.getY()),2) <= Math.pow(this.radius,2)){
            return true;
        }else {
            return false;
        }
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public String description(){
        return "Klasa Koło.";
    }

}
