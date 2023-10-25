package src.ASD.Basic_algorythms.DynamicProgrammig;

public class fiboRabbitsDynamic {
    private static int monthsToCheck = 25;

    //fibonacci rabbit problem with dynamic programig approach
    //first try to make a math formula for this particular problem (or find one in net)
    public static void main(String[] args) {
        System.out.print("Liczba królików dynamicznie po 25 miesiącach: ");
        System.out.print(fiboRabbits(monthsToCheck));
    }
    public static int fiboRabbits(int firstRabbitPair){
        //Array for dynamic approach - it will remember quantity of rabbits for 25 months
        int[] rabbitAmount = new int[monthsToCheck];

        //month is our interval so baisicly its 1 to 2 steps back
        rabbitAmount[0] = 1;
        rabbitAmount[1] = 2;

        for (int i = 2; i < rabbitAmount.length; i++){
            rabbitAmount[i] = rabbitAmount[i - 1] + rabbitAmount[i - 2];
        }
        return rabbitAmount[rabbitAmount.length - 1];
    }
}
