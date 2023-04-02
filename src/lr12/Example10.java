package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example10 {
    public static List<Integer> getNumbers(List<Integer> inputList, int value) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : inputList) {
            if (num < value) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10, 15, 18, 17, 100, 25, 1, 5);
        List<Integer> result = getNumbers(inputList, 15);
        System.out.println(result);
    }
}
