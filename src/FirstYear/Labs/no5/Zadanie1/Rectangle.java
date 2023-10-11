package FirstYear.Labs.no5.Zadanie1;

public class Rectangle extends Figure{
    double hight=0, width=0;

    public Rectangle(double hight, double width){
        this.hight = hight;
        this.width = width;
    }
    public Rectangle(float hight, float width, String color){
        this.hight = hight;
        this.width = width;
        this.color = color;
        Figure rectangle0 = new Figure();
    }
    public void move(float moveX, float moveY) {
        punkt.setX((int) (punkt.getX()+moveX));
        punkt.setY((int) (punkt.getY()+moveY));
    }
    public double getField() {
        return (hight * width);
    }
    public String description(){
        return "Klasa Prostokąt. Kolor obiektu: "+color;
    }


}
