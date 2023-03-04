package lr9.task1;

public class Example8 {
    public static int m(){
        try {
            System.out.println("0");
            throw new RuntimeException(); // нет catch, будет ошибка
        }
        finally { System.out.println("1"); // "1" печатается не смотря на то, что исключение не перехватывается
        }
    }
    public static void main(String[] args) { System.out.println(m());
    }
}
