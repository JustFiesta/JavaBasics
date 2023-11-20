package src.ASD.Basic_algorythms.rewindForTest;

public class icecreamProblemGreedy {
    public static int[][] ice_cream = {
            //0   1   2   3   4   5
            { 0,  7, 20, 21, 12, 23},//0
            {27,  0, 13, 16, 46,  5},//1
            {53, 15,  0, 25, 27,  6},//2
            {16,  2, 35,  0, 47, 10},//3
            {31, 29,  5, 18,  0,  4},//4
            {28, 24,  1, 17,  5,  0} //5
    };

    public static void main(String[] args) {
        System.out.println("Optymalny czas produkcji lodów wynosi: " + icecreamFactory());
    }
    public static int icecreamFactory(){
        int optimalIceCreamIndex = 0; // index
        int minTime;
        int currentIcecream = 0; // current icecream
        String iceCreamOrder = "";
        int optimalTime = 0;

        int count = 0;
        while (count < 5){
            System.out.println("current icecream index: " + currentIcecream);
            minTime = Integer.MAX_VALUE;

            for (int i = 0; i < ice_cream.length; i++){
                System.out.println("current icecream time val: " + ice_cream[currentIcecream][i]);

                if (minTime > ice_cream[currentIcecream][i] && ice_cream[currentIcecream][i] != 0){
                    minTime = ice_cream[currentIcecream][i];
                    optimalIceCreamIndex = i;
                }
            }
            System.out.println("optimalIceCreamIndex: " + optimalIceCreamIndex);

            optimalTime += ice_cream[currentIcecream][optimalIceCreamIndex];

            for (int delIndex = 0; delIndex < ice_cream.length; delIndex++){
                ice_cream[currentIcecream][delIndex] = 0;
                ice_cream[delIndex][currentIcecream] = 0;
            }

            currentIcecream = optimalIceCreamIndex;
            iceCreamOrder += optimalIceCreamIndex + 1;
            count++;

            System.out.println("Optimal Time:" + optimalTime);
            System.out.println(iceCreamOrder);

        }

        return optimalTime;
    }
}
