package Labs.no5.Zadanie1;

public class Circle extends Figure{
    double radius;
    public Circle(double radius, Point point){
        this.radius = radius;
    }
    public double getField(){
        return Math.pow(this.radius,2) * ( Math.PI);
    }
    public double getDiameter(){
        return this.radius*2;
    }
    public boolean inCircle(Point point){
//        if ()
//        return true;
//
        return false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
