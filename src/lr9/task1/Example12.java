package lr9.task1;

public class Example12 {
    public static void m(String str, double chislo){
        if (str==null) {
            throw new IllegalArgumentException("Строка введена неверно");// т.к. str == null исключение не будет перехвачано, т.к. нет соответствующего catch, будет ошибка
        }
        if (chislo>0.001) { // не работает, есть ошибка IllegalArgumentException
            throw new IllegalArgumentException("Неверное число");
        }
    }
    public static void main(String[] args) { m(null,0.000001);} //1. в метод передаются аргументы String "null" & double "0.000001"
}

