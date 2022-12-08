package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел в сумме");
        int x = in.nextInt();

        CalcNums.WhileNums(x);
        CalcNums.ForNums(x);
    }

    private static class CalcNums {
        private static void WhileNums(int x) {
            System.out.println("Цикл While");
            int sum = 0;
            Random random = new Random();
            int x1 = x;
            while (x1 > 0) {
                int nums = random.nextInt(500);
                if (nums % 5 == 2 || nums % 3 == 1) {
                    System.out.printf("%d ", nums);
                    sum = sum + nums;
                    x1--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }

        private static void ForNums(int x) {
            System.out.println("\nЦикл For");
            int sum = 0;
            Random random = new Random();
            for (int i = random.nextInt(100); x > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d ", i);
                    sum = sum + i;
                    x--;
                }
            }
            System.out.printf("сумма чисел: %d", sum);
        }
    }
}

/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
 */
