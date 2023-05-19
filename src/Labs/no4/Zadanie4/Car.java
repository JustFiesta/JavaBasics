package Labs.no4.Zadanie4;

public class Car implements Moveable{
    String marka;
    @Override
    public void start() {
        System.out.println("Samochód jedzie");
    }

    @Override
    public void stop() {
        System.out.println("Samochód zatrzymał się");
    }
}
