package Labs.no7.Zadanie9;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Podaj liczby do działań");

        System.out.println("Pierwsza liczba: ");
        int a = InputInteger();

        System.out.println("Druga liczba: ");
        int b = InputInteger();

        System.out.println("Wybierz działanie (+, -, *, /): ");
        Scanner usrinput = new Scanner(System.in);
        String usrChoice = usrinput.next();

        switch (usrChoice){
            case "+":
                System.out.println(Sum(a, b));
                break;
            case "-":
                System.out.println(Substract(a, b));
                break;
            case "*":
                System.out.println(Multiply(a, b));
                break;
            case "/":
                System.out.println(Divide(a, b));
                break;
            default:
                System.out.println("Podaj poprawne działanie!");
                break;
        }

    }
    public static int InputInteger(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static int Sum(int a, int b){
        int result = a + b;
        return result;
    }
    public static int Substract(int a, int b){
        int result = a - b;
        return result;
    }
    public static int Multiply(int a, int b){
        int result = a * b;
        return result;
    }
    public static Integer Divide(int a, int b){
        try {
            int result = a / b;
            return result;
        }catch (ArithmeticException e){
            System.out.println("Nie można dzielić przez zero!");
            return null;
        }
    }
}
