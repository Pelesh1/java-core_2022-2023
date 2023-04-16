package lr13;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int[]arr = new int[20];
        for (int i=0;i < arr.length;i++)
        {
            arr[i] = rand.nextInt(100);
            System.out.println("["+i+"] элемент массива: "+arr[i]);
        }
        int threadsCount = Runtime.getRuntime().availableProcessors();
        int partLength = arr.length/threadsCount;
        int sums[] = new int[threadsCount];

        Thread[] threads = new Thread[threadsCount];
        for (int i =0; i <threadsCount;i++)
        {
            int startIndex = i;
            int endIndex = (i==threadsCount-1)?arr.length:(i+1)*partLength;

            int[]subArr = Arrays.copyOfRange(arr,startIndex,endIndex);
            int final_i = i;
            Thread thread = new Thread(()->
                    sums[final_i]=calculateSum(subArr));
            thread.start();

            threads[i] = thread;
        }
        for (Thread thread:threads)
        {
            thread.join();
        }
        int sum = 0;
        for (int i =0;i<threadsCount;i++)
        {
            sum+=sums[i];
        }
        System.out.println("Сумма элементов массива равна: "+sum);
    }
    static int calculateSum(int[] arr)
    {
        int sum = 0;
        for (int i =0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
