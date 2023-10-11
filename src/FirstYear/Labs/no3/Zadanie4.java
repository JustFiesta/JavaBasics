package FirstYear.Labs.no3;

import java.util.concurrent.ThreadLocalRandom;

import static FirstYear.Labs.no3.Zadanie1.InputInt;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Ile liczb chcesz wylosować?");
        int num = InputInt();
        System.out.println("Suma randomowych liczb parzystych: "+SumRandom(num));
    }
    public static int SumRandom(int howMany){

        int sum = 0;

        for (int i = 0; i < howMany; i++){
            int random = ThreadLocalRandom.current().nextInt(-10, 25);
            if (random % 2 == 0){
                sum += random;
            }
        }
        return sum;
    }
}
