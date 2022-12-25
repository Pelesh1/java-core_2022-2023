package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(200);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();
        int[][] firstArray = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = "+i+";j= "+j+";value= "+firstArray[i][j]);
            }
        }
        System.out.println("===================================");

        int deleteStrok = random.nextInt(a-1);
        int deleteStolb = random.nextInt(b-1);

        System.out.println("deleteStrok = "+(deleteStrok)+";deleteStolb= "+(deleteStolb));
        System.out.println("===================================");

        int[][] secondArray = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteStrok){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteStolb) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + "; value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
/*
Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */
