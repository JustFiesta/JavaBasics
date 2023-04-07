package Labs.no5.Zadanie1;

public class Square extends Rectangle{
    public Square(double hight) {
        super(hight, hight);
    }

    public Square(float hight, String color) {
        super(hight, hight, color);
    }
    public void setHeight(double hight) {
        this.hight = hight;
        this.width = hight;
    }

    public double getHeight() {
        return hight;
    }
    public String description(){
        return "Klasa Kwardrat. Kolor obiektu: "+color;
    }

}
