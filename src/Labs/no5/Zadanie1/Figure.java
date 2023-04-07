package Labs.no5.Zadanie1;

public class Figure {
    Point punkt;
    String color = "bialy";


    public Figure(){
        punkt = new Point(0,0);
    }
    public Figure(String color){
        this.color=color;
    }
    public Figure(Point point){
        this.punkt=point;
    }
    public String getColor(){
        return color;
    }
    public String description(){
        return "Klasa Figura. Kolor obiektu: "+color;
    }
}