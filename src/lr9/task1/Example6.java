package lr9.task1;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        }
        catch (ArithmeticException e) {
            System.out.println("1 "+e ); } //пропускается
        catch (RuntimeException e) {
            System.out.println("3 "+e );} // печатает 3 и исключение
        catch (Exception e) {
            System.out.println("2 "+e ); } //пропускается
            System.out.println("4");
    }
}

