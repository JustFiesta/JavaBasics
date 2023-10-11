package FirstYear.Labs.no9.Zadanie4;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        readBinaryFiles(userPathScanner());
    }

    //metoda wczytująca ścieżkę do pliku binarnego
    public static String userPathScanner(){
        System.out.println("Podaj ścieżkę pliku binarnego do odczytu: ");
        Scanner userInput = new Scanner(System.in);
        return userInput.next();
    }

    //metoda odczytująca zawartość pliku
    public static int readBinaryFiles(String filePath) throws IOException {

        DataInputStream inputStream = null;

        try {
            inputStream = new DataInputStream(new FileInputStream(filePath));
            return inputStream.readInt();
        }finally {
            if (inputStream != null){
                inputStream.close();
            }
        }
    }
}
