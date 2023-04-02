package lr12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Example1 {
    public static int[] getmas(int[] raw) {
        return IntStream.of(raw).filter(x -> x % 2 == 0).toArray();
    }
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 1, 200).toArray();
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Целые числа: " + Arrays.toString(getmas(arr)));
    }
}
