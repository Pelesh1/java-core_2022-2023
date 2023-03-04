package lr9.task2;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        try{
            PositiveAverageArray(SetArray());}
        catch (NullPointerException e){
            System.out.println("Отсутсвуют элементы массива("+e+")");
        }
        catch (Exception e){
            System.out.println("Неверный ввод данных ("+e+")");
        }
    }
    private static int[] SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int x = scan.nextInt();
        int[] Array = new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Введите целочисленный элемент массива:"+"["+(i+1)+"]");
            Array[i]=scan.nextInt();
        }
        return Array;
    }
    private static void PositiveAverageArray(int [] InputArray){
        double X=0;
        boolean prog = false;
        for (int j : InputArray) {
            if (j>0){
                X += j;}
            else if (j==0){
                prog=true;
            }
        }
        if (X<=0&&!prog){
            throw new NullPointerException("Отсутствуют положительные элементы массива");
        }
        System.out.println("Среднее значение среди положительных элементов  массива = ["+(X/InputArray.length)+"]");
    }
}
