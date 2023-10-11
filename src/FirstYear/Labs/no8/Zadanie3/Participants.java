package FirstYear.Labs.no8.Zadanie3;

import java.util.Objects;

//Klasa tworząca jednego uczestnika
public class Participants {
    //Dane uczestnika
    private int ID, age;
    private String name;

    //Jawny konstruktor klasy
    public Participants(int id, String name, int age){
        this.ID = id;
        this.name = name;
        this.age = age;
    }

    //Wygenerowane metody eguals i hashcode do porównywania obiektów tej klasy
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participants that = (Participants) o;
        return ID == that.ID && age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, age, name);
    }

    @Override
    public String toString() {
        return "Informacje o uczestniku " +
                "ID: " + ID  + ", " +
                "Age: " + age + ", " +
                "Name: " + name + ", ";
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
