package lr6;

public class Example7 {
    public static void main(String[] args) {
        char[] alphabet = {'п', 'р', 'о', 'г', 'р', 'а', 'м', 'м',
                'и','р','о','в','а','н','и','е'};
        example7.transformation(alphabet);
        example7.work();
    }
    private static class example7 {
        static int[] IntArray;
        private static void transformation(char[] ChArray) {
            IntArray = new int[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                IntArray[i] = ChArray[i];
            }
        }
        private static void work() {
            for (int i = 0; i < IntArray.length; i++) {
                System.out.println("Элемент массива [" + i + "] = " + IntArray[i]);
            }
        }
    }
}
/*
Напишите программу со статическим методом, аргументом которому передастся
символьный массив, а результатом возвращается ссылка на целочисленным массив,
состоящий из кодов символов из массива- аргумента
 */
