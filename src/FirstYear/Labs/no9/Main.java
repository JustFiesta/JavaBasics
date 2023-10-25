package FirstYear.Labs.no9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Tekstowe
        TextFile textFile = new TextFile();

        textFile.ReadFile();
        textFile.SaveFile();
        textFile.ReadFile();
        textFile.SaveFileWriter();
        textFile.ReadFile();

        //Binarne
        int number = 123123123;

        String pathName = "FirstYear/Labs/textBinary.bin";
        BinaryFile binaryFile = new BinaryFile();
        binaryFile.writeBinaryFile(pathName, number);
        System.out.println(binaryFile.readBinaryFile(pathName));
    }
}
