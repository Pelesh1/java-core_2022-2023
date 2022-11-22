package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month name: ");
        String month_name = in.nextLine();

        System.out.println("Input the number of days in a month");
        int day = in.nextInt();

        System.out.println("In " + month_name + " "+ day + " days");
    }
}
