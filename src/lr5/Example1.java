package lr5;

public class Example1 {
    public static void main(String[] args) {
        Example Example1 = new Example();
        Example1.SetCh1('F');

        System.out.println("getCodeSymbol = " + Example1.getCodeSymbol());
        Example1.showCodeAndValue();
    }
}
class Example {
    private char ch1;
    public void SetCh1(char ch1) {
        this.ch1 = ch1;
    }
    public int getCodeSymbol() {
        return  ch1;
    }
    public void showCodeAndValue() {
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}

/*
Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код
 */
