package lr6;

public class Example2 {
    public static class Example{
        private static int vai;
        public static void work(){
            System.out.println(vai);
            vai++;
        }
    }

    public static void main(String[] args) {
        Example2.Example.work();
        Example2.Example.work();
        Example2.Example.work();
        Example2.Example.work();
        Example2.Example.work();
        Example2.Example.work();
    }
}
/*
Напишите программу с классом, в котором есть закрытое статическое
целочисленное ноле с начальным нулевым значением. В классе должен быть описан
статический метод, при вызове которого отображается текущее значение статического
поля, после чего значение поля увеличивается на единицу.
 */
