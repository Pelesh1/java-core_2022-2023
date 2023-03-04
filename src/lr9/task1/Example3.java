package lr9.task1;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        }
        catch (NullPointerException e) {
            System.out.println("1 "+e ); // пропускается
        }
        catch (RuntimeException e) {
            System.out.println("2 "+e);  // печает 2 и исключение
        }
        catch (Exception e) {
            System.out.println("3 "+e ); // исключение уже обработано
        }
        System.out.println("4"); // будет 4
    }
}
