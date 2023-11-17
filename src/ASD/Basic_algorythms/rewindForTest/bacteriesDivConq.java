package src.ASD.Basic_algorythms.rewindForTest;

public class bacteriesDivConq {
    static int time = 0;
    static boolean[] checked = new boolean[3];
    public static void main(String[] args) {
        bacteriesSplit(1);
    }
    public static int bacteriesSplit(int startingBacteries) {
        time += 2;

        if (startingBacteries >= 1000 && !checked[0]) {
            checked[0] = true;
            System.out.println("Liczba bakterii zwiększyła się 1000 razy po: " + time + " minutach");
        } else if (startingBacteries >= 10000 && !checked[1]) {
            checked[1] = true;
            System.out.println("Liczba bakterii zwiększyła się 10000 razy po: " + time + " minutach");
        } else if (startingBacteries >= 100000 && !checked[2]) {
            checked[2] = true;
            System.out.println("Liczba bakterii zwiększyła się 100000 razy po: " + time + " minutach");
        } else if (startingBacteries >= 1000000) {
            System.out.println("Liczba bakterii zwiększyła się 1000000 razy po: " + time + " minutach");
            return 0;
        }

        return bacteriesSplit(startingBacteries * 2);
    }
}
