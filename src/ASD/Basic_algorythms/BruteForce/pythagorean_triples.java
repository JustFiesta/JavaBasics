package ASD.Basic_algorythms.BruteForce;

public class pythagorean_triples {
    public static void main(String[] args) {

        //Znajdywanie trójek pitagorejskich
        // I wersja to metoda brutalnej siły
        for (int a = 1; a <= 20; a++){
            for (int b = a + 1; b <= 20; b++){
                for (int c = b + 1; c <= 20; c++){
                    if (a * a + b * b == c * c){
                        System.out.println("Znalezione trójki: " + a + " " + b + " " + c);

                    }
                }
            }
        }
    }
}
