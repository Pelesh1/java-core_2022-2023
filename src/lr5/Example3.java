package lr5;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int int1 = in.nextInt();
        System.out.println("Введите второе число");
        int int2 = in.nextInt();
        Example Example1 = new Example();
        Example Example2 = new Example(int1);
        Example Example3 = new Example(int1, int2);
    }

    static class Example {
        private int num1;
        private int num2;

        Example() {
            System.out.println("Без передачи\n");
        }

        Example(int num1) {
            System.out.println("Передача одного аргумента ");
            this.num1 = num1;
            System.out.println("num1+num1 = " + Summa(num1) + "\n");
        }

        public int Summa(int num1) {
            this.num1 = num1;
            int result = 0;
            for (int i = 1; i <= num1; i++) {
                result = num1 + num1;
            }
            return result;
        }

        Example(int num1, int num2) {
            System.out.println("Передача двух аргументов");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("num1^num2 = " + exponentPow(num1, num2) + "\n");
        }

        public int exponentPow(int n1, int n2) {
            n1 = num1;
            n2 = num2;
            int result = 1;
            for (int i = 1; i <= num2; i++) {
                result = num1 * result;
            }
            return result;
        }
    }
}
/*
Напишите программу с классом, у которого есть два целочисленных поля.
В классе должны быть описаны конструкторы, позволяющие создавать
объекты без передачи аргументов, с передачей одного аргумента и с передачей
двух аргументов.
 */
