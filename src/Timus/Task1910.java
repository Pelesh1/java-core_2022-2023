package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int Size;
        int count = 2;
        Size = in.nextInt();
        int[] Array = new int[Size];
        for (int i = 0; i < Size; i++) {
            Array[i] = in.nextInt();
        }
        int sum = Array[0]+Array[1]+Array[2];
        for (int i = 2; i < (Size-1); i++) {
            int sumTemp = Array[(i-1)]+Array[i]+Array[(i+1)];
            if (sumTemp>sum){
                sum = sumTemp;
                count = i+1;
            }
        }
        in.close();
        System.out.println(sum+" "+count);
        out.flush();
    }
}
