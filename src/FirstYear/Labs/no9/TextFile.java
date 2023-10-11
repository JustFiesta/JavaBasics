package FirstYear.Labs.no9;


import java.io.*;
import java.util.Scanner;


public class TextFile {
    //Odczyt pliku - metoda odczytu
    public void ReadFile() throws IOException {
        //Najlepiej korzystać z wyjątkóœ

        //albo cała ścieżka albo tylko nazwa (wtedy zapisze się w folderze glównym projektu)
        File plik = new File("test.txt");
        Scanner in = new Scanner(plik); // odczytywanie elementów pliku

        String tekst = in.nextLine();
        System.out.println(tekst);
    }

    //Zapis pliku
    public void SaveFile() throws IOException{
        //otawrcie pliku i zapis
        PrintWriter zapis = new PrintWriter("test.txt");
        zapis.println("ala ma kota");
        //zamknięcie pliku
        zapis.close();
    }

    public void SaveFileWriter() throws IOException{
        String filePath = "test.txt";
        int numer = 123;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
                        // jak zapisać liczbę?
            fileWriter.write(Integer.toString(numer));
        } finally {
            if (filePath != null){
                fileWriter.close();
            }
        }
    }

    //odczyt całego bufora
    public int ReadFileBuffor() throws IOException{
        String filePath = "test.txt";
        int numer = 0;
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String numberAsString = fileReader.readLine();
            numer = Integer.parseInt(numberAsString);
        }finally {
            if (fileReader != null){
                fileReader.close();
            }
        }
        return 0;
    }
}
