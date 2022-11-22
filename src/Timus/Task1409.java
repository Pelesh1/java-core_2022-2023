package Timus;

import java.util.Scanner;

public class Task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько банок подстрелил Гарри?");
        int bank1 = in.nextInt();

        System.out.println("Сколько банок подстрелил Ларри?");
        int bank2 = in.nextInt();

        int it = bank2+bank1-1;
        int itgg = it-bank1;
        int itgl = it-bank2;

        System.out.println(itgg + " " + itgl);

    }
}
