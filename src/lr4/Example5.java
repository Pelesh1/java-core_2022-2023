package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество  столбцов массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество строк массива: ");
        int b = in.nextInt();
        int[][] firstArray = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = "+i+"; j= "+j+"; Случайное число= "+firstArray[i][j]);
            }
        }
        System.out.println("После изменения");

        int[][] secondArray = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i = "+i+";j= "+j+"; Случайное число= "+secondArray[i][j]);
            }
        }
    }
}
/*Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.
 */
