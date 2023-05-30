package Labs.no9.Zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader inputFile = null;
        int numberLine = 0;
        String line;

        System.out.println("Podaj ścieżke do pliku");
        try{
            inputFile = new BufferedReader(new FileReader(input.next()));
            System.out.println("Zawartosć pliku:");
            while (true){
                line = inputFile.readLine();
                if (line == null) break;
                numberLine++;
                System.out.println(line);
            }
        }finally {
            if (inputFile != null){
                inputFile.close();
            }
        }
        System.out.println("Plik zawiera: " + numberLine + " linii");
    }
}
