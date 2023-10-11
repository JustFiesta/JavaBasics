package FirstYear.Labs.no9.Zadanie3;

import java.io.*;
import java.util.Scanner;

public class Main {
    //przykład zapisu do pliku binarnego
//    DataOutputStream outputStream = null;
//        try {
//        outputStream = new DataOutputStream(new FileOutputStream(filePath));
//        outputStream.writeInt(number);
//    }finally {
//        if (outputStream != null){
//            outputStream.close();
//        }
//    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String fileName;
        int day, month, year;

        System.out.println("Podaj nazwę pliku: ");
        fileName = input.next();

        System.out.println("Podaj datę twoich urodzin (osobno dzień, miesiąc i rok)");
        System.out.println("*Dzień*");
        day = input.nextInt();
        System.out.println("*Miesiąc*");
        month = input.nextInt();
        System.out.println("*Rok*");
        year = input.nextInt();

        writeToBinaryFile(fileName, day);
        writeToBinaryFile(fileName, month);
        writeToBinaryFile(fileName, year);
    }
    public static void writeToBinaryFile(String fileName, int contents) throws IOException{
        DataOutputStream saveToFile = null;
        try {
//                                                       nazwanym jako \/       \/ do kontruktora dodaje true - czyli będzie dodawać linijki a nie nadpisywać plik
            saveToFile = new DataOutputStream(new FileOutputStream(fileName, true));
            saveToFile.writeInt(contents);
        }finally {
            if (saveToFile != null){
                saveToFile.close();
            }
        }
    }

}
