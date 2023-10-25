package ASD.Basic_algorythms.BruteForce;

public class printAllSubSetsBF {
    public static void main(String[] args) {
        //We need to print all posible subsets of given numbers (for ex. we have 4 nums)

        //Brute force attempt:
        int num1, num2, num3, num4;
        for (num1 = 0; num1 <= 1; num1++){
            for (num2 = 0; num2 <= 1; num2++){
                for (num3 = 0; num3 <= 1; num3++){
                    for (num4 = 0; num4 <= 1; num4++){
                        System.out.print("{");
                        if (num1 == 1){
                            System.out.print("1");
                        }
                        if (num2 == 1){
                            System.out.print("2");
                        }
                        if (num3 == 1){
                            System.out.print("3");
                        }
                        if (num4 == 1){
                            System.out.print("4");
                        }
                        System.out.println("}");
                    }
                }
            }
        }
    }
}
