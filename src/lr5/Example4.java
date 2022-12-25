package lr5;

public class Example4 {
    public static void main(String[] args) {
        Example Example1 = new Example(12, 'A');
        Example Example2 = new Example(65.1267);
    }

    static class Example {
        private char ch1;
        private int int1;

        Example(int i, char c) {
            this.ch1 = c;
            this.int1 = i;
            int length = (int) (Math.log10(int1) + 1);
            double result = (double) ch1 + (double) int1 * 1 / Math.pow(10, length);
            System.out.println("Результат = " + result + "; Год = " + (double) ch1 + ";\n");
        }

        Example(double d) {
            char ch1 = (char) d;
            int1 = (int) ((d - (int) d) * 100);
            System.out.println("Символ = " + ch1 + "; Значение = " + int1 + "\n");
        }
    }
}
/*
Напишите программу с классом, у которого есть символьное и
целочисленное поле. В классе должны быть описаны версии конструктора с
двумя аргументами (целое число и символ – определяют значения полей), а
также с одним аргументом типа double. В последнем случае действительная
часть аргумента определяет код символа (значение символьного поля), а
дробная часть (с учетом десятых и сотых) определяет значение
целочисленного поля. Например, если аргументом передается число 65.1267,
то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
поле получит значение 12 (в дробной части учитываются только десятые и
сотые).
 */

