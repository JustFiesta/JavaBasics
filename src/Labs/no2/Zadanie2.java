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
        float a = InputInt();
        float b = InputInt();

        System.out.println("Suma liczb "+a+" i "+b+" to: "+Suma(a, b));
        System.out.println("Różnica liczb "+a+" i "+b+" to: "+Roznica(a, b));
        System.out.println("Iloraz liczb "+a+" i "+b+" to: "+Iloraz(a, b));
        System.out.println("Iloczyn liczb "+a+" i "+b+" to: "+Iloczyn(a, b));
        System.out.println("Potęgi liczb "+a+" i "+b+" to: "+Potega(a, b));
        System.out.println("Pierwiastki liczb "+a+" i "+b+" to: "+Pierwiastek(a, b));
        System.out.println("Funkcje trygonometryczne liczb "+a+" i "+b+" to: "+Tryg(a, b););
    }
    public static float Suma(float a, float b){
        return a+b;
    }
    public static float Roznica(float a, float b){
        return a-b;
    }
    public static float Iloczyn(float a, float b){
        return a*b;
    }
    public static float Iloraz(float a, float b){
        if(b != 0){
            return a/b;
        }else if (a != 0){
            return b/a;
        }else return 0;
    }
    public static double Potega(float a, float b){
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
    public static void Menu(){

    }
}
