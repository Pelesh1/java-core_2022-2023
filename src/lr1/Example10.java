package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input Year of birth: ");
        int year = in.nextInt();
        year = 2022 - year;


        System.out.print("To you " + year);
    }
}
