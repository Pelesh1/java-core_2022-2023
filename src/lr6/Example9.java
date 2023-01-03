package lr6;

public class Example9 {
    public static void main(String[] args) {
        char[] charArray = {'п','р','и','в','е','т','с','т','в','у','ю'};
        example9.CharArray(charArray);
        example9.showopposite();
    }
    private static class example9 {
        private static char[] reverseCharArray;
        private static void CharArray(char[] ChArray) {
            char change;
            int x = ChArray.length-1;
            reverseCharArray = new char[ChArray.length];
            for (int i = 0; i < ChArray.length; i++) {
                change = ChArray[i];
                reverseCharArray[i] = ChArray[x-i];
                reverseCharArray[x-i] = change;
            }
        }
        private static void showopposite() {
            for (int i = 0; i < reverseCharArray.length; i++) {
                System.out.println("Обратный массив[" + i + "] = " + reverseCharArray[i]);
            }
        }
    }
}
/*
Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последн и м , второй — с предпоследним и так далее
 */
