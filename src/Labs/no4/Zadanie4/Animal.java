package Labs.no4.Zadanie4;

abstract public class Animal {
    private String name = "brak imienia";

    public Animal(String name) {
        this.name = name;
    }

    abstract String getType(); //metoda abstrakcyjna

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Zwierze posiada dane:{" +
                "Imię: " + name + '\n';
    }
}
