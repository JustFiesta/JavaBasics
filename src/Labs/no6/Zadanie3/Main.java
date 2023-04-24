package Labs.no6.Zadanie3;

public class Main {
    public static void main(String[] args) {
        Kwadrat figura0 = new Kwadrat(5, "Czerwony");
        Punkt figura1 = new Punkt(5,6);
        Trojkat figura3 = new Trojkat(6,7, "Pomarańczowy");

        Kwadrat figura4 = new Kwadrat(5, "Kremowy");
        Punkt punkt1 = new Punkt(6,7);
        Trojkat figura5 = new Trojkat(8,7, "Limonkowy");

        Kwadrat figura6 = new Kwadrat(2, "Bordowy");
        Punkt punkt2 = new Punkt(4,8);
        Trojkat figura7 = new Trojkat(8,9, "Niebieski");

        Prostokat figura8 = new Prostokat(2, 3, "Granatowy");

        System.out.println(figura0.Opis());

        //Tablica obiektów
        Figura tablicaFigur[] = new Figura[9];


    }
}
