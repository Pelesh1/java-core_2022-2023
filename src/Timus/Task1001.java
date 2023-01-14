package Timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        while (in.hasNextLong()) {
            long p = in.nextLong();
            list.add(p);
        }
        in.close();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt((double) list.get(i)));
        }
    }
}


