package lr5;

public class Example5 {
    public static void main(String[] args) {
        Example Example5 = new Example(50);
        System.out.println("Число = " + Example5.PrintInt());

        Example5.Set(40);
        System.out.println("Число = " + Example5.PrintInt());

        Example5.Set(500);
        System.out.println("Число = " + Example5.PrintInt());

        Example5.Set(-50);
        System.out.println("Число = " + Example5.PrintInt());

        Example5.Set();
        System.out.println("Число = " + Example5.PrintInt());
    }

    static class Example {
        private int int1;
        public void Set(int n) {
            System.out.println("Set() c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }
        public void Set() {
            System.out.println("Set() без аргумента");
            int1 = 0;
        }
        public int PrintInt() {
            return int1;
        }
        Example(int int1) {
            System.out.println("Конструктор");
            this.Set(int1);
        }
    }
}
/*
Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля.
 */
