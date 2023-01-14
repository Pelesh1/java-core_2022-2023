package lr8_Task1.Task3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    public static void readALLByArray(InputStream in) throws IOException{
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("колличество = "+ count + ", buff = "+ Arrays.toString(buff) + ", str = "+ new String(buff, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "src\\lr8_Task1\\Task3\\text1.txt";
        InputStream inFile= null;
        try {
            inFile = new FileInputStream(fileName);
            readALLByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла"+fileName+e);
        } finally {
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
