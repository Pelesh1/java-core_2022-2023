package lr6;

public class Example3 {
    private static class Example{
        private static void Max(int ... array){
            int max = array[0];
            for (int i = 0;i<array.length; i++){
                max = Math.max(max, array[i]);
            }
            System.out.println("Максимальное значение = "+max);
        }
        private static void Min(int ... array){
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                min = Math.min(min, array[i]);
            }
            System.out.println("Mинимальное значение = "+min);
        }
        private static void Avg(int ... array){
            int sum = 0;
            for (int i =0; i<array.length; i++) {
                sum = array[i]+sum;
            }
            double avg = (double)sum/array.length;
            System.out.println("Среднее значение = "+avg);
        }
    }
    public static void main(String[] args) {
        Example.Max(8,30,-3,-32,25,50);
        Example.Min(1,10,-15,31,69,78,-150,228);
        Example.Avg(10,5,27,-30,1,81,-50,32);
    }
}
/*
Напишите программу с классом, в котором есть статические методы, которым
можно передавать произвольное количество целочисленных аргументов (или
целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
значение из набора чисел
 */

