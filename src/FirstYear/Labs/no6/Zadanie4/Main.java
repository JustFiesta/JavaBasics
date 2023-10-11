package FirstYear.Labs.no6.Zadanie4;

public class Main {
    public static void main(String[] args) {
        Bike wigry = new Bike();
        Car polonez = new Car();
        Dog szarik = new Dog("Szarik");

        race(wigry, polonez, szarik);
    }
    public static void race(Moveable... moveables){ //przyjęcie dowolnej liczby obiektów Moveable - Moveable... moveables jest to tablicą (varargs)
        for (Moveable moveable : moveables) { //for each po talibcy (przeleci każdy element)
            moveable.start();
        }
    }
}
