package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();

        int num1 = number - 1;
        int num2 = number + 1;
        int sum = num1 + num2 + number;


        System.out.println("Num 1:" +  + num1 +  " Num2:" + number + " Num3: " + num2 + " Num4: " + Math.pow(sum, 2));

    }
}
