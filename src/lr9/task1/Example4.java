package lr9.task1;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException e) { System.out.println("1 "+e); } // пропускается
        catch (Exception e) { System.out.println("2 "+e); } // печатает 2 и исключение
        catch (Error e) { System.out.println("3 "+e); } // пропускается
        System.out.println("4");
    }
}
