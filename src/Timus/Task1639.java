package Timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1639 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int m,n;
        m = in.nextInt();
        n = in.nextInt();
        in.close();
        int t = (m*n)%2;
        String res;
        if (t==0){
            res = "[:=[first]";
        }
        else{
            res = "[second]=:]";
        }

        System.out.println(res);
        out.flush();
    }
}
