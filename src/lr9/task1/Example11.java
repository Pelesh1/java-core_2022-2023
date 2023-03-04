package lr9.task1;

public class Example11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e ); // печатает 1 и исключение
        }
        finally { //ибо finally - выполняется также эта часть
            System.out.println("2" );
        }
            System.out.println("3");
    }
}
