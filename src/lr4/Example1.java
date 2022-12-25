package lr4;

public class Example1 {
    public static void main(String[] args) {
        int rows = 11;
        int columns = 23;
        int x;
        for (int i = 1 ; i <= rows; i++){
            System.out.print("Номер строки: " + i + " ");
            x = 0;
            for (int j = 1; j <=columns; j++){
                System.out.print("|");
                x = x + 1;
            }
            System.out.println("Количество символов в строке: " + x);
        }
    }
}


/*
Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк;
 */
