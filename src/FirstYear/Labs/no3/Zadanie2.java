package FirstYear.Labs.no3;
import static FirstYear.Labs.no3.Zadanie1.InputInt;

public class Zadanie2 {

    public static void main(String[] args) {
        final int count = 10;

        int[] nums = new int[10];

        for (int i = 0; i < count; i++){
            System.out.println("Podaj liczbe nr: "+(i+1));
            nums[i] = InputInt();
        }

        CountSign(nums);
        System.out.println("Suma liczb ujemnych: "+SumNeg(nums));
        System.out.println("Suma liczb dodatnich: "+SumPos(nums));
    }
    public static void CountSign(int[] array){
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                negative += 1;
            }else if (array[i] > 0){
                positive += 1;
            }
        }
        System.out.println("Liczby ujemne: "+negative);
        System.out.println("Liczby dodatnie: "+positive);
    }
    public static int SumNeg(int[] array){
        int negative = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0)
                negative += array[i];
        }
        return negative;
    }public static int SumPos(int[] array){
        int positive = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0)
                positive += array[i];
        }
        return positive;
    }
}

