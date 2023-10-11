package FirstYear.Labs.no2;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Nieskonczonosc();
    }
    public static void Nieskonczonosc(){
        while (true){
            Scanner pytaj = new Scanner(System.in);
            int liczba = pytaj.nextInt();
            if (liczba < 0){
                break;
            }
        }
    }
}
