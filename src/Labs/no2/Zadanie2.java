package Labs.no2;

import static Labs.no1.PierwszaLekcja.InputInt;

public class Zadanie2 {
    //    Zadanie 2
//    Nowości w switchu
//    switch (wybor){
//        case 1 -> Metoda();
//        default -> Metoda1();
//        Nie potrzeba breaka wtedy
//    }

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę nr 1: ");
        float a = InputInt();
        System.out.println("Wpisz liczbę nr 2: ");
        float b = InputInt();

        System.out.println("Wybierz działanie 1-7 (Lub zakończ 8)");
        System.out.println("1 - Suma; 2 - Różnica, 3 - Iloczyn; 4 - Iloraz; 5 - Potęga liczby nr 1 do liczby nr 2; 6 - Pierwiastki obu liczb; 7 - Funkcje trygonometryczne obu liczb");
        int liczMenu = (int) InputInt();
        Menu(liczMenu, a, b);
    }
    public static float Suma(float a, float b){
        System.out.println("Suma liczb "+a+" i "+b+" to: "+(a+b));
        return a+b;
    }
    public static float Roznica(float a, float b){
        System.out.println("Różnica liczb "+a+" i "+b+" to: "+(a-b));
        return a-b;
    }
    public static float Iloczyn(float a, float b){
        System.out.println("Iloczyn liczb "+a+" i "+b+" to: "+(a*b));
        return a*b;
    }
    public static float Iloraz(float a, float b){
        if(b != 0){
            System.out.println("Iloraz liczb "+a+" i "+b+" to: "+(a/b));
            return a/b;
        }else if (a != 0){
            System.out.println("Iloraz liczb "+a+" i "+b+" to: "+(b/a));
            return b/a;
        }else return 0;
    }
    public static double Potega(float a, float b){
        System.out.println("Potęgi liczb "+a+" i "+b+" to: "+Math.pow(a, b));
        return (float) Math.pow(a, b);
    }
    public static void Pierwiastek(float a, float b){
        double pierwiastekA = Math.sqrt(a);
        double pierwiastekB = Math.sqrt(b);
        System.out.println("Pierwiastek a = "+pierwiastekA+"; Pierwiastek b = "+pierwiastekB);
    }
    public static void Tryg(float a){
       double sin = Math.sin(Math.toRadians(a));
       double cos = Math.cos(Math.toRadians(a));
       double tan = Math.tan(Math.toRadians(a));
       double cotan = cos/sin;
       System.out.println("Trygonometria dla kąta "+a+": sinus = "+sin+"; cosinus = "+cos+"; tangens = "+tan+"; cotangens"+cotan);
    }
    public static void Menu(int liczMenu, float a, float b){
        int i = 1;
        while (i == 1) {
            switch (liczMenu) {
                case 1:
                    Suma(a, b);
                    break;
                case 2:
                    Roznica(a, b);
                    break;
                case 3:
                    Iloczyn(a, b);
                    break;
                case 4:
                    Iloraz(a, b);
                    break;
                case 5:
                    Potega(a, b);
                    break;
                case 6:
                    Pierwiastek(a, b);
                    break;
                case 7:
                    Tryg(a);
                    Tryg(b);
                    break;
                case 8: i = 0;
                    System.out.println("Adios");
                    break;
            }
        }
    }
}
