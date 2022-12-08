package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели");
        String dayweek = in.nextLine();

        weekday.Ifmet(dayweek);
        weekday.Switchmet(dayweek);
    }
    static class weekday {
        static void Ifmet(String days) {
            String day = days;
            int dayIF = 0;
            if (day.equals("Понедельник")) {
                dayIF = 1;
            } else if (day.equals("Вторник")) {
                dayIF = 2;
            } else if (day.equals("Среда")) {
                dayIF = 3;
            } else if (day.equals("Четверг")) {
                dayIF = 4;
            } else if (day.equals("Пятница")) {
                dayIF = 5;
            } else if (day.equals("Суббота")) {
                dayIF = 6;
            } else if (day.equals("Воскресенье")) {
                dayIF = 7;
            } else {
                System.out.println(day + " некорректное значение дня недели");
            }
            if (dayIF != 0) {
                System.out.printf("%s это %s день недели\n", day, dayIF);
            }
        }

        static void Switchmet(String days) {
            String day = days;
            switch (day) {
                case "Понедельник":
                    System.out.println(day + " это 1 день недели");
                    break;
                case "Вторник":
                    System.out.println(day + " это 2 день недели");
                    break;
                case "Среда":
                    System.out.println(day + " это 3 день недели");
                    break;
                case "Четверг":
                    System.out.println(day + " это 4 день недели");
                    break;
                case "Пятница":
                    System.out.println(day + " это 5 день недели");
                    break;
                case "Суббота":
                    System.out.println(day + " это 6 день недели");
                    break;
                case "Воскресенье":
                    System.out.println(day + " это 7 день недели");
                    break;
                default:
                    System.out.println(day + " некорректное значение дня недели");
                    break;
            }
        }
    }
}


/*
Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */
