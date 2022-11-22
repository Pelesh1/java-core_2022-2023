package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();

        System.out.println("Input 2 number: ");
        int number2 = in.nextInt();

        int sum;
        sum = (number+number2);

        System.out.println("Sum: " + sum);
    }
}
