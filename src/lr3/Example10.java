package lr3;


import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = in.nextInt();
        System.out.println("Размер массива равен "+ Size);
        int[] nums = new int[Size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        for(int i = nums.length-1 ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        System.out.println("По убыванию");
        for (int i = 0 ; i < nums.length ; i++ ){
            System.out.println("Элемент массива ["+i+"] после сортировки =" + nums[i]);
        }
    }
}

/*Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */