package Labs.no7.Zadanie8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i = 3;

        while (i != 0) {
            int a = RandomInts();
            int b = RandomInts();

            try{
                float result = a/b;
                System.out.println("Wynik dzielenia dwóch losowych liczb: " + result + " (liczby: " + a + " " + b +")");
            }catch (ArithmeticException e){
                System.out.println("Wylosowano dzielenie przez 0");
                i--;
            }

        }
    }
    public static int RandomInts(){
        Random generator = new Random();
        int randomInt = generator.nextInt(-10, 11);
        return randomInt;
    }
}
