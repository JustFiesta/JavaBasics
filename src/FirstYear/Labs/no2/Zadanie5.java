package FirstYear.Labs.no2;

public class Zadanie5 {
    public static void main(String[] args) {
        Wypisz20();
    }

    public static void Wypisz20() {
        int i;
        for (i = 20; i!=0; i--){
            if (i == 2 || i ==6 || i == 9 || i == 15 || i == 19){
                continue;
            }
            System.out.println(i);
        }
    }
}
