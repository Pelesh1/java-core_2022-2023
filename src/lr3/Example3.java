package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел Фибоначчи");
        int x = in.nextInt();

        Fibonach.WhileFibonach(x);
        Fibonach.ForFibonach(x);
    }

    static class Fibonach {
        static void WhileFibonach(int x) {
            int a = x;
            long b = 0;
            long c = 1;
            long v = 1;
            while (a > 0) {
                System.out.printf("%d ", v);
                v = b + c;
                b = c;
                c = v;
                a--;
            }
            System.out.println("\nконец данного цикла");
        }

        static void ForFibonach(int x) {
            long a = 0;
            long b = 1;
            long c = 1;
            for (int x1 = x; x1 > 0; --x1) {
                System.out.printf("%d ", c);
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("\nконец данного цикла");
        }
    }
}

/*
Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается по-
следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла
 */
