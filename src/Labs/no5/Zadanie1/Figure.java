package Labs.no5.Zadanie1;

public class Figure {
    Point punkt;
    String kolor = "bialy";


    public Figure(){
        punkt = new Point(0,0);
    }
    public Figure(String kolor){
        this.kolor=kolor;
    }
    public Figure(Point punkt){
        this.punkt=punkt;
    }
    public String getKolor(){
        return kolor;
    }
    public String description(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }
}