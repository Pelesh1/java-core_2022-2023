package lr11.Example3;

import java.util.Random;

public class Recursion {
    private int size;
    private int[] Array;

    public Recursion(int size) {
        Array = new int[size];
        System.out.println("");
        System.out.println("Ввод значений массива:");
        setRec(size);
        System.out.println("");
        System.out.println("Вывод значений массива");
        getRec(size);
    }

    public void setRec(int x) {
        Random random = new Random();

        int i = x - 1;
        if (x != 0) {
            setRec(x - 1);
            Array[i] = random.nextInt(10);
            System.out.print(Array[i] + ", ");
        }
    }

    public void getRec(int x) {
        int i = x - 1;

        if (x != 0) {
            getRec(x - 1);
            System.out.print(Array[i] + ", ");
        }
    }
}