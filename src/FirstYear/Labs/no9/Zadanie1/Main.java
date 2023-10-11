package FirstYear.Labs.no9.Zadanie1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String line;

        System.out.println("Podaj ścieżkę dostępu pliku");
        try {
            output = new FileWriter(input.nextLine());
            System.out.println("Koniec zapisu nastąpi po wpisaniu '-'");
            while (true){
                line = input.nextLine();
                if (line.equals("-")) break;
                output.write(line);
                output.write(System.lineSeparator());

            }
        }finally {
            if (output != null){
                output.close();
            }
        }
    }
}