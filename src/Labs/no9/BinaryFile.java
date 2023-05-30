package Labs.no9;

import java.io.*;

public class BinaryFile{

    //Odczytywanie binarnych plików
    public int readBinaryFile(String filePath) throws IOException{
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

    public void writeBinaryFile(String filePath, int number) throws IOException{
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            outputStream.writeInt(number);
        }finally {
            if (outputStream != null){
                outputStream.close();
            }
        }
    }

}
