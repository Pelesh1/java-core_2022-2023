package lr12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example7 {
    public static List<String> getStrings(List<String> inputList, int length) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str.length() > length) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Программирование", "Урфу", "Функция", "Рисование", "Отдых", "Сыр");
        int length = 4;
        List<String> result = getStrings(inputList, length);
        System.out.println(result);
    }
}
