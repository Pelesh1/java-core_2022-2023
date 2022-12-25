package Timus;

import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int ost = 0;

        for (int i =0; i<y; i++){

            int t = in.nextInt();
            ost = ost + t - x;
            if(ost<0){
                ost = 0;
            }
        }
        System.out.println(ost);
    }
}
