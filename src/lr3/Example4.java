package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите первое целое число");
        int x = in.nextInt();
        System.out.println("Ввведите второе целое число");
        int y = in.nextInt();

        SortNums.WhileNums(x, y);
        SortNums.ForNums(x, y);
    }

    static class SortNums {
        static void WhileNums(int x, int y) {
            if (x > y) {
                while (y <= x) {
                    System.out.printf("%d ", y);
                    y++;
                }
            }
            else {
                while (x <= y) {
                    System.out.printf("%d ", x);
                    x++;
                }
            }
            System.out.println("конец данного цикла");
        }

        static void ForNums(int x, int y) {
            if (x > y) {
                for (int y1 = y; y1 <= x; y1++) {
                    System.out.printf("%d ", y1);
                }
            } else {
                for (int x1 = x; x1 <= y; x1++) {
                    System.out.printf("%d ", x1);
                }
            }
            System.out.println("конец данного цикла");
        }
    }
}

/*
Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
 */

