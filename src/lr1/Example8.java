package lr1;

import java.util.Date;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of the week: ");
        String day_of_the_week = in.nextLine();

        System.out.println("Input month name: ");
        String month_name = in.nextLine();

        System.out.println("Input number in the month: ");
        int number_in_the_month=in.nextInt();


        System.out.printf("Day of the week: %s \nNumber in the month: %d \nMonth name: %s", day_of_the_week, number_in_the_month, month_name);



    }
}
