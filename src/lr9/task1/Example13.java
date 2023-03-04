package lr9.task1;

public class Example13 {
    public static void main(String[] args) {
            try {
                int l = args.length; // присваивается значение аргумента main args = 0
                System.out.println("размер массива= " + l); //  размер массива = 0
                int h=10/l; //при расчете h - деление на 0
                args[l + 1] = "10"; // строка пропушена из-за ошибки
            }
            catch (ArithmeticException e) {// исключение обработано, печатает "деление на ноль"
                System.out.println("Деление на ноль"); }
            catch (ArrayIndexOutOfBoundsException e) { //  часть кода пропущена
                System.out.println("Индекс не существует"); }
    }
}
