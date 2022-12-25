package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int row = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int col = in.nextInt();
        int array[][] = new int[row][col];
        int minRow = 0, maxRow = row - 1, minCol = 0, maxCol = col - 1;
        int count = 0;
        int max = row * col;
        while (count < max) {
            for (int i = minCol; i <= maxCol; i++) {
                array[minRow][i] = count;
                count++;
            }
            minRow = minRow + 1;
            for (int i = minRow; i <= maxRow; i++) {
                array[i][maxCol] = count;
                count++;
            }
            maxCol = maxCol - 1;
            for (int i = maxCol; i >= minCol; i--) {
                array[maxRow][i] = count;
                count++;
            }
            maxRow = maxRow - 1;
            for (int i = maxRow; i >= minRow; i--) {
                array[i][minCol] = count;
                count++;
            }
            minCol = minCol + 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println("");
        }
    }
}


/*
Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
 */
