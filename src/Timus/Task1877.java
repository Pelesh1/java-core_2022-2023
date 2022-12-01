package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int cod1 = in.nextInt();
        int cod2 = in.nextInt();

        if(cod1 % 2==0 || cod2 % 2!=0 )
        {
            System.out.print("yes");
        }
        else if(cod1 % 2 != 0 || cod2% 2== 0)
        {
            System.out.print("no");
        }
        out.flush();
    }
}

