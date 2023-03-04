package lr9.task1;

public class Example9 {
    public static int m(){
        try {
            System.out.println("0");
            return 55; // выход из метода с присвоением 55
        }
        finally { //ибо finally - выполняется также эта часть
            System.out.println("1"); }
    }
    public static void main(String[] args){
        System.out.println(m());
    }
}
