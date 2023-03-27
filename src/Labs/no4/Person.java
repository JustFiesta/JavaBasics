package Labs.no4;

public class Person {
    //Definicja pól
    String imie, nazwisko;
    int wiek;

    //metody dla tej klasy

    public void wypisz() {
        System.out.println("Imie i nazwisko: "+imie+" "+nazwisko+" i wiek: "+wiek);
    }

    //Konstruktory - zawsze są publiczne, mają nazwę klasy, tworzy obiekt i wpisuje od razu dane
    //Niejawny konstruktor
    public Person(){

    }
    //Przeciażenie (overload) metody - zmiana ciała metody
    //this - wskazuje na obiekt klasy
    public Person(String imie){
        this.imie = imie; //do pola klasy wstaw to co jest w metodzie
    }
//    alt+insert - generator np konstruktorów
//
//    public Person(int wiek) {
//        this.wiek = wiek;
//    }

    public Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    //Gettery i settery - umożliwiają pobranie i ustawienie pola w klasie
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

}
