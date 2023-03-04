package lr9.task1;

public class Example10 {
    public static int m(){
        try {
            System.out.println("0");
            return 15; // выход из метода с присвоением 15
        }
        finally { //ибо finally - выполняется также эта часть
            System.out.println("1");
            return 20; //4. выход из метода, замена 15 на 20
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }

}
