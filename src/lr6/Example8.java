package lr6;
import java.util.Random;

public class Example8 {
    public static void main(String[] args) {
            Random random = new Random(500);
            int ArrayLength = 10;
            int intArray[] = new int[ArrayLength];
            for (int i = 0 ; i <ArrayLength; i++){
                intArray[i] = random.nextInt(1000);
                System.out.println("Элемент массива ["+i+"] = "+intArray[i]);
            }
            System.out.println("Среднее значение = "+example8.Avg(intArray));
        }
        protected static class example8{
            private static double Avg (int[] Array){
                int sum=0;
                for (int i = 0 ; i <Array.length; i++){
                    sum += Array[i];
                }
                return (double)sum/Array.length;
            }
    }
}
/*
Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве)
 */