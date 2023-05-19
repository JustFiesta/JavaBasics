package Labs.no6.Zadanie4;

public class Dog extends Animal implements Moveable, Speakable{

    public Dog(String name) {
        super(name);
    }
    @Override
    public String getVoice() {
        return Speakable.super.getVoice();
    }
    @Override
    public String getType() {
        return "Pies";
    }
    @Override
    public void start() {
        System.out.println(getType() + " " + getName() + " rusza");
    }
    @Override
    public void stop() {
        System.out.println(getType() + getName() + "zatrzymał się");
    }
    @Override
    public String getVoice(int voice) {
        return null;
    }
}
