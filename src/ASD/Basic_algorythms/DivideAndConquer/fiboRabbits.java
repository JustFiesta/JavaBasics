package ASD.Basic_algorythms.DivideAndConquer;

public class fiboRabbits {
    //fibonacci rabbit problem
    //first try to make a math formula for this particular problem (or find one in net)
    public static void main(String[] args) {
        System.out.print("Liczba królików po 25 miesiącach: ");
        System.out.print(fiboRabbits(25));
    }
    public static int fiboRabbits(int firstRabbitPair){
        //month is our interval so baisicly its 1 to 2 steps back
        if (firstRabbitPair == 1 || firstRabbitPair == 0){
            return 1;
        }
        return fiboRabbits(firstRabbitPair-1) + fiboRabbits(firstRabbitPair-2);
    }
}
