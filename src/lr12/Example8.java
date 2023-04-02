package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example8 {
    public static List<Integer> getNumbers(List<Integer> inputList, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputList) {
            if (number > threshold) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(5, 10, 13, 15, 20, 1, 152);
        int threshold = 10;
        List<Integer> result = getNumbers(inputList, threshold);
        System.out.println(result);
    }
}
