package src.ASD.Basic_algorythms.rewindForTest;

public class bacteriesDynamic {
    static int time = 0;
    static boolean[] checked = new boolean[3];
    public static void main(String[] args) {

        //second index for next step
        int[] bacteriesPop = {1, 0};

        while (true){
            time += 2;

            bacteriesPop[1] = bacteriesPop[0] * 2;

            if (bacteriesPop[0] >= 1000 && !checked[0]) {
                checked[0] = true;
                System.out.println("Liczba bakterii zwiększyła się 1000 razy po: " + time + " minutach");
            } else if (bacteriesPop[0] >= 10000 && !checked[1]) {
                checked[1] = true;
                System.out.println("Liczba bakterii zwiększyła się 10000 razy po: " + time + " minutach");
            } else if (bacteriesPop[0] >= 100000 && !checked[2]) {
                checked[2] = true;
                System.out.println("Liczba bakterii zwiększyła się 100000 razy po: " + time + " minutach");
            } else if (bacteriesPop[0] >= 1000000) {
                System.out.println("Liczba bakterii zwiększyła się 1000000 razy po: " + time + " minutach");
                return;
            }

            bacteriesPop[0] = bacteriesPop[1];
        }
    }
}
