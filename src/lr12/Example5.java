package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static List<String> getStrings(List<String> inputList, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str != null && str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Программирование", "Урфу", "Функция", "Рисование", "Отдых", "Сыр");
        String substring = "ова";
        List<String> result = getStrings(inputList, substring);
        System.out.println(result);
    }
}


