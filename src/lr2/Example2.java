package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (( num % 5 == 2) && (num % 7 == 1)){
            System.out.println(num + " Удовлетворяет условиям");
        } else {
            System.out.println(num + " Не удовлетворяет условиям");
        }
    }
}
