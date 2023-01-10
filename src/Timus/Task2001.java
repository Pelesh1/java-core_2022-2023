package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int first,second;
        int [] Calc = new int [6];
        for (int i =0; i<6;i++){
            Calc[i] = in.nextInt();
        }
        in.close();
        first = Calc[0]-Calc[4];
        second = Calc[1]-Calc[3];

        System.out.print(first+" "+second);
        out.flush();
    }
}
