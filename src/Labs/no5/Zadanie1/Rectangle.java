package Labs.no5.Zadanie1;

public class Rectangle {
    double height=0, width=0;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;

    }

    public double getPowierzchnia() {
        return (height * width);
    }
}
