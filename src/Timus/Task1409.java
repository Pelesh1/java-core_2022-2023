package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int g = in.nextInt();
        int l = in.nextInt();
        int itg = g+l-1;
        int itgg=itg-g;
        int itgl=itg-l;

        out.println(itgg+" "+itgl);
        out.flush();

    }
}
