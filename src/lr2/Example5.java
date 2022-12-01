package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите число ");
        int num = in.nextInt();

        int num2;

        num2 = num/1000%1000;
        System.out.printf("Тысяч: %d ",num2);
    }
}

