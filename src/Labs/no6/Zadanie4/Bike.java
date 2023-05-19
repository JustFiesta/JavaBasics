package Labs.no6.Zadanie4;

public class Bike implements Moveable{

    @Override
    public void start() {
        System.out.println("Rower rusza");
    }

    @Override
    public void stop() {
        System.out.println("Rower zatrzymał się");
    }
}
