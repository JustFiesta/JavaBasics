package Labs.no4;

public class Klasy {
    public static void main(String[] args) {
        Person osoba = new Person();
        osoba.imie = "Jan";
        osoba.nazwisko = "Kowalski";
        osoba.wiek = 20;
        osoba.wypisz();

        Person fifonz = new Person("fifonz");
        fifonz.wypisz();

        fifonz.setNazwisko("Nowakowski");
        fifonz.setWiek(21);
        System.out.println(fifonz.getNazwisko());

        System.out.println(osoba.toString());
    }

}
