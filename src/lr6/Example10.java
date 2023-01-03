package lr6;

public class Example10 {
    public static void main(String[] args) {
        Example10.example10.calcMaxMin(32,-20,-9,22,59);
        Example10.example10.showMaxMin();
        Example10.example10.calcMaxMin(-2,10,59,-150,350);
        Example10.example10.showMaxMin();
    }
    protected static class example10 {
        private static int[] MaxMin;
        private static void calcMaxMin(int ... array){
            int max = array[0];
            int min = array[0];
            for (int i =0; i<array.length; i++) {
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);
            }
            MaxMin= new int[]{max, min};
        }
        private static void showMaxMin() {
            System.out.println("\nМаксимальное значение = " + MaxMin[0]);
            System.out.println("Минимальное значение  = " + MaxMin[1]);
        }
    }
}
/*
Напишите программу со статическим методом, аргументом которому передается
произвольное количество целочисленных аргументов. Результатом метод возвращает
массив из двух элементов: это значения наибольшего и наименьшего значений среди
аргументов, переданных методу
 */