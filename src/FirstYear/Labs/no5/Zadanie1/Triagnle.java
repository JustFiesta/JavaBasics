package FirstYear.Labs.no5.Zadanie1;

public class Triagnle extends Figure{
    double height = 0, base = 0;

    public Triagnle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Triagnle(float height, float base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }
    public String description(){
        return "Klasa Trójkąt. Kolor obiektu: "+color;
    }

}
