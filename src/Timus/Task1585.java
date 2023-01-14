package Timus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1585 {
    public static void main(String[] args) {
        String inputFileName = "src/Timus/input2.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        try {
            BufferedReader bueferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));
            String readLine;
            int num = 0;
            int emperor = 0;
            int little = 0;
            int macaron = 0;
            while ((readLine = bueferedReader.readLine()) != null) {
                if (num == 0) {
                    num = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("Emperor Penguin")) {
                    emperor++;
                }
                if (readLine.contains("Little Penguin")) {
                    little++;
                }
                if (readLine.contains("Macaroni Penguin")) {
                    macaron++;
                }
            }
            if (emperor >= little) {
                if (emperor >= macaron) {
                    System.out.println("Emperor Penguin");
                } else if (emperor <= macaron) {
                    System.out.println("Macaroni Penguin");
                }
            } else if (emperor <= little) {
                if (little > macaron) {
                    System.out.println("Little Penguin");
                } else if (little <= macaron) {
                    System.out.println("Macaroni Penguin");
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

