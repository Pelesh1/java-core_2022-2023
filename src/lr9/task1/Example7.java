package lr9.task1;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);// печатает 1 и исключение
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2 " + e); //3. исключение не перехвачено, печатается ошибка
        }
        System.out.println("3"); // не выполняется из за ошибки
    }
}
