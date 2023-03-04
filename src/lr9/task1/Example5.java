package lr9.task1;

public class Example5 {
    public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new RuntimeException("ошибка");// не будет перехвачено
            }
            catch (NullPointerException e) {
            System.out.println("1 "+e ); } // пропускается
            System.out.println("2"); // не выполняется из за ошибки
    }
}
