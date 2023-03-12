// Samo się dodaje (dodanie bibliotek)
import java.util.*;

public class PierwszaLekcja {

    //psvm - skrót do \/
    public static void main(String[] args) {

        //sou - skrót \/
        System.out.printf("Skróty");

        // crtl+d - kopia bieżącej linii
        System.out.printf("Kopiowanie");
        System.out.printf("Kopiowanie");
        System.out.printf("Kopiowanie");

        //komentowanie ctrl+shift+/

        //zmienne
        int a;
        float b = 2.1231222223F; // f F - na końcu aby zabezpipeczyć liczbę
        double c; // d D
        short c2;
        long c3 = 123123123123123123L; // L
        char znak = 'X';
        String tekst;
        //stała zmienna - const w C - nie da sie jej zmienić jak define
        final int liczba = 23;
//        liczba = 233;
        boolean prawda; // T albo F
        var result = 11 + 12; //typ specjalny - kompilator domyśli się że to będzie wynik i to będzie int

        //w obiektówce robimy w metodach (one są poza mainem), METODY są po kropce
        System.out.println(Name());
        System.out.println(Age());

        // Czytanie z klawiatury
        // klasa obiektu       \/ nowy obiekt typu Scanner i przekazuje System.in
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj a: ");
        float x = input.nextFloat();
        System.out.println("Podaj b: ");
        float y = input.nextFloat();

        //metoda (prawie jak funkcja obiektu)
        Dzialania(x, y);

        float liczba1 = InputInt();
        float liczba2 = InputInt();


        //Losowanie liczb
        Random losowanie = new Random(); // nowy obiekt
        //zakres 0 - 10                 \/ (ile liczb) + punkt startowy

        int losuj = losowanie.nextInt(10) + 0;
        int losuj2 = losowanie.nextInt(10) - 5; //od -5 przez 0 do 4 (bo w sumie 10 liczb)
        System.out.println(losuj);

        double o = InputInt();
        Pierwiastek(o);

        int aa, bb;
        aa = (int) InputInt();
        bb = (int) InputInt();

        int cc = losowanie.nextInt(aa)+bb;
        Trojkat(aa, bb, cc);
    }

    //Tutaj tworzymy obiekty (poza mainem)

    //Metoda do czytania liczb
    public static float InputInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        float z = input.nextFloat();
        return z;
    }

    //Czy parzysta?
    public static boolean CzyParzysta(float a) {
        if (a % 2 == 0) return true;
        else return false;
    }

    //Czy dziel sie przez 3 i 5?
    public static boolean CzyP3i5(int a) {
        if (a % 3 == 0 && a % 5 == 0) return true;
        else return false;
    }

    //Funkcje matematyczne
    public static float Matematyka() {
        System.out.println(Math.abs(-2));
        System.out.println(Math.round((2.20000034453F)));
        System.out.println(Math.ceil(2.23344234466F)); //zaokrl w góre
        System.out.println(Math.floor(2.234255266F)); //zaokrl w dół

        Math.log(2);
        Math.log10(2); // log naturalny
        Math.log1p(23.10);//log z pi
        Math.pow(2, 3);// 2 do potęgi 3
        Math.sqrt(34);
        Math.min(2, 3);
        Math.max(2, 3);

        return 0;
    }

    //zrób metodę zwracającą imie:
    public static String Name() {
        return "Mateusz";
    }

    public static int Age() {
        return 21;
    }

    //Metoda zwracająca sume itd
    public static void Dzialania(float a, float b) {
//                                                     \/ musi być nawias bo inaczej potraktuje to jako znaki nie działanie
        System.out.println("Suma " + a + " + " + b + " = " + (a + b));// wypisywanie jak w pythonie
        System.out.println("Różnica " + a + " - " + b + " = " + (a - b));
        System.out.format("Iloczyn %f.3 + %f.5 = %f", a, b, (a * b)); //wypisywanie jak w C
        //%c znak, %d liczba, %f float (%f.3 to 3 miejsca po przecinku), %s string, %t czas (kalendarz),
    }

    public static double Pierwiastek(double o) {
        double b = o;
        o = Math.sqrt(o);
        b = o;
        System.out.println("Pierwiastek liczby " + o + " wynosi: " + b);
        return 0;
    }

    public static boolean Trojkat(int aa, int bb, int cc){
        if (aa+bb > cc){
            System.out.println("Można");
            return true;
        } else if (aa+cc > bb) {
            System.out.println("Można");
            return true;
        } else if (bb+cc > aa) {
            System.out.println("Można");
            return true;
        } else {
            boolean b = false;
            System.out.println("NIE");
            return b;
        }
    }

}