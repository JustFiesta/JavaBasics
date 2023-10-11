package FirstYear.Labs.no3;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {
        //Traktuj tablice jak pojemniki
        //Deklaracja tablicy jednowymiarowej liczb
        int[] array1;
        array1 = new int[4];

        //Ręczne wpisanie danych
        int[] array = new int[4];

        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = array[1]*array[2];

        //Drugi sposób z wpisaniem danych
        int[] array2 = new int[]{1,2,3,4,5,3};

        //Skrócone bez new int[]{...}
        int[] data = {1,2,3,4};

        //Deklaracja tablicy stringów
        String[] arrayString = new String[]{"ala","ma","kota"};

        //Stała długości tablicy
        final int arrLen = 10;

        //Przechodzenie po elementach tablicy
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]+" ");
        }

        //Definicja iteratora, któru bierze każdy element po dwuktopku po kolei
        for (int i: array){
            System.out.println(i);
        }


        //Tablica znaków
        char[] arrayChar = new char[]{'j','a','v','a'};
        
        for (int i: arrayChar){
            System.out.println(i); //dlaczego wypisuje ascii?
        }


        //Zmiana tablicy znaków na słowo
        String StringTab = new String(arrayChar);
        System.out.println(StringTab);

        String[] arrayString2 = new String[]{"jeden", "dwa plus jeden", "trzy"};


        //String na tablice charów
        String text = "To jest tekst do podziału na tablice";
        String[] textArray = text.split(" "); //Dzieli na kolejny pojemnik (indeks tablicy), po spacji

        //Sposób 2
        char[] charArray = text.toCharArray();
        System.out.println(charArray);


        //Kopiowanie tablicy;
        String[] copyArray = new String[7];
        System.arraycopy(textArray, 0, copyArray, 0, textArray.length);

        String[] tab = Arrays.copyOf(textArray, textArray.length);


        //Długość tablicy
        System.out.println("Długość tablicy: "+arrayString.length);
        System.out.println("Długość słowa: "+StringTab.length()+"\n");


        //Tablice wielowymiarowe
        int[][][] data1 = new int[2][3][1];

        int[][] matrixA = {
                {1,2,3},
                {3,4},
                {2,3,4,5,6,7,8,9},
        };

        //Pętla for each
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }

        //Drugi sposób iteracji przez tablice wielowymiarowe
        for (int[] innerArray: matrixA){
            for (int data2: innerArray){
                System.out.print(data2 + " ");
            }
            System.out.println();
        }

//        for (int[] innerArray: matrixA){
//            for (int data3: innerArray){
//               for (int item: data3) {
//                   System.out.print(item + " ");
//               }
//            }
//            System.out.println();
//        }

        //Wbudowana klasa obiektowa Arrays
        //konwersja tablicy na stringa
        System.out.println(Arrays.toString(data)); //Podgląd metod i klas wbudowanych - prawy i Go to - declaration method

        //Uzupełnienie tablicy dowolnymi elementami
        int[] dataXYZ = new int[10];
        Arrays.fill(dataXYZ, 2);

        //Porównanie obiektów w talbicy
        int[] dataY = {1,2,3};
        int[] dataX = {1,3,3};
        System.out.println("Wynik equals: "+ Arrays.equals(dataY, dataX)); //zwraca    T/F
        System.out.println("Wynik compare: "+ Arrays.compare(dataY, dataX)); //zwraca 0/-1


        //Odwrócenie tablicy - reverse
        System.out.println("Tablica od tyłu:");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]+" ");
        }
    }
}
