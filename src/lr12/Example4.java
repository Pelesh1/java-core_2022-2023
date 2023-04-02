package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static List<Integer> getSquares(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : inputList) {
            result.add(num * num);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(2, 4, 6, 8, 10, 12);
        List<Integer> result = getSquares(inputList);
        System.out.println(result);
    }
}
