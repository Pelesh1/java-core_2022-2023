package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки, разделенные пробелом: ");
        String[] input = scanner.nextLine().split(" ");

        List<String> strings = new ArrayList<String>();
        for (String str : input) {
            strings.add(str);
        }

        List<String> filteredStrings = bigButton(strings);

        System.out.println("Строки с большой буквы:");
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
    public static List<String> bigButton(List<String> strings) {
        List<String> result = new ArrayList<String>();
        for (String str : strings) {
            if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                result.add(str);
            }
        }
        return result;
    }
}

