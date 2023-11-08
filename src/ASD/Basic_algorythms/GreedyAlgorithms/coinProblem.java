package ASD.Basic_algorythms.GreedyAlgorithms;

import java.io.IOException;
import java.io.*;

public class coinProblem {
    // sombody gives you paper money, how would you give them change?
    // if smb pays 3.73PLN bill with 10PLN - you would check if how many you can give 5pln in change (1 time? 2 times? etc)
    // you give them 5pln, the rest change remaining is 1,27
    // can you give them 5? no
    // can you give them 2? no
    // can you give them 1? yes
    // you give them 1pln, the rest change remaining is 0,27
    // can you give them 5? no
    // can you give them 2? no
    // can you give them 1? no
    // can you give them 0.5? no
    // can you give them 0.2? yes
    // you give them 0.2pln, the rest change remaining is 0,07
    // can you give them 5? no
    // can you give them 2? no
    // can you give them 1? no
    // can you give them 0.5? no
    // can you give them 0.2? no
    // can you give them 0.1? no
    // etc...

    // not very optimal but works!
    public static void main (String[]args) throws IOException {

        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);

        String tekst;

        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int[] coinLimit = {1, 0, 0, 0, 2, 2, 5, 2, 1}; // 13,49PLN
        int zl, gr, r, i = 0;

        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);


        System.out.println("Reszta: ");

        r = zl * 100 + gr;

        int[] monetki = new int[9];

        while (r > 0 && i < M.length) {
            if (r >= M[i] && coinLimit[i] > 0)  {
                System.out.print(M[i] / 100.0 + " ");
                r = r - M[i];
                monetki[i]++;
            } else
                i++;
        }
        System.out.println();
        System.out.println("==============");
        System.out.println("ilosc 5     " + monetki[0]);
        System.out.println("ilosc 2     " + monetki[1]);
        System.out.println("ilosc 1     " + monetki[2]);
        System.out.println("ilosc 0.5   " + monetki[3]);
        System.out.println("ilosc 0.2   " + monetki[4]);
        System.out.println("ilosc 0.1   " + monetki[5]);
        System.out.println("ilosc 0.05  " + monetki[6]);
        System.out.println("ilosc 0.02  " + monetki[7]);
        System.out.println("ilosc 0.01  " + monetki[8]);
        if (r > 0){
            System.out.println("Pozostała reszta: " + r/100);
        }
    }
}
