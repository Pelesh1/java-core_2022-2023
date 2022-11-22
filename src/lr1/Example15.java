package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number 1: ");
        int num1 = in.nextInt();

        System.out.println("Input number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("Sum: " + sum + " Difference:" + difference);
    }
}
