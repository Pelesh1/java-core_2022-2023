package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example9 {
    public static List<String> getStrings(List<String> inputList) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str.matches("[а-яA-я]+")) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("привет23", "123№91", "программирование", "!!!!????", "отдых");
        List<String> result = getStrings(inputList);
        System.out.println(result);
    }
}
