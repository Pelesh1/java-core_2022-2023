package lr9.task1;

public class Example14 {
    public static void m(int x) throws ArithmeticException{ // расширение метода исключение будет перехвачено
        int h=10/x; //при расчете h - деление на 0
    }
    public static void main(String[] args) {
        try {
            int l = args.length; //  присваивается значение аргумента main args = 0
            System.out.println("размер массива= " + l); //  размер массива = 0
            m(l); //3. в метод передан аргумент l = "0"
        }
        catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль"); // исключение обработано
        }
    }
}
