package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int numberTask = in.nextInt();
            int difference = 12 - numberTask;
            int time = difference * 45;

            if (time <= 240) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            out.flush();
        }
}


