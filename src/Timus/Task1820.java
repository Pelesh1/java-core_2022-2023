package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n,k;
        int time=0;
        n=in.nextInt();
        k=in.nextInt();
        in.close();
        if (n%k==0){
            time = (n/k)*2;
        }
        else if (n<=k){
            time = 2;
        }
        else if(n%k <= k/2 && n%k >0){
            time = ((n/k)+1)*2-1; }
        else if(n%k > k/2){
            time = ((n/k)+1)*2;
        }

        System.out.print(time);

        out.flush();
    }
}
