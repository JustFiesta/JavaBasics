package FirstYear.Labs.no7.Zadanie5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        int num = InputInt();

        System.out.println("Podaj liczbę z rozwinięciem dziesiętnym");
        float num2 = InputFloat();

        System.out.println("Podaj napis");
        String str = InputString();
    }
    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        int usrInput = 0;

        for (int i = 0; i==0; ){
            try {
                usrInput = input.nextInt(); // to łapiemy
                break;// jeżeli wyjątek nie wystąpił
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                input.next(); //i wprowadzamy kolejną jeżeli wystąpi błąd
            }
        }
        return usrInput;
    }
    public static float InputFloat(){
        Scanner input = new Scanner(System.in);
        float usrInput = 0;

        for (int i = 0; i==0; ){
            try {
                usrInput = input.nextFloat(); // to łapiemy
                break;// jeżeli wyjątek nie wystąpił
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                input.next(); //i wprowadzamy kolejną jeżeli wystąpi błąd
            }
        }
        return usrInput;
    }
    public static String InputString(){
        Scanner input = new Scanner(System.in);
        String usrInput="";

        for (int i = 0; i==0; ){
            try {
                usrInput = input.next(); // to łapiemy
                break;// jeżeli wyjątek nie wystąpił
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawną liczbę!");
                input.next(); //i wprowadzamy kolejną jeżeli wystąpi błąd
            }
        }
        return usrInput;
    }
}
