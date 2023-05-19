package Timus;

import java.util.Scanner;

public class Task1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int N = in.nextInt() - 1;
            int numbers = in.nextInt();
            int result = 1;
            if (N == 0) {
                System.out.println(result + " " + numbers);
                continue;
            }

            int nextNum = in.nextInt();

            while (N >= 0) {
                if (N != 0) {
                    if (numbers == nextNum) {
                        ++result;
                    } else {
                        System.out.print(result + " " + numbers + " ");

                        numbers = nextNum;
                        result = 1;
                    }
                } else {
                    System.out.print(result + " " + numbers + " ");
                }

                --N;
                if (N > 0) {
                    nextNum = in.nextInt();
                }
            }

            System.out.println();
        }
    }

}
