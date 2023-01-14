package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N,A,B;
        N=in.nextInt();
        A=in.nextInt();
        B=in.nextInt();
        int weight = N*A*B*2;
        in.close();

        System.out.print(weight);
        out.flush();
    }
}
