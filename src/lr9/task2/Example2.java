package lr9.task2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2{
    public static void main(String[] args) {
        WMatrix();
        WPrintColumn();
    }
    private static void WMatrix() {
        try {PrintMatrix(CreateMatrix());}
        catch(NegativeArraySizeException e){
            System.out.println("Ввели неправильный размер матрицы ("+e+")");
            WMatrix();
        }
        catch(InputMismatchException e){
            System.out.println("Ввели неправильный параметр матрицы ("+e+")");
            WMatrix();
        }
    }
    private static void WPrintColumn(){
        try{PrintColumn();}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Столб за пределами матрицы ("+e+")");
            WPrintColumn();
        }
        catch(InputMismatchException e){
            System.out.println("Ввели неверный параметр столба ("+e+")");
            WPrintColumn();
        }
    }
    private static int width;
    private static int height;
    private static int[][] MatrixStat;
    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t");
            }
            System.out.println();
        }
    }
    private static int [][] CreateMatrix(){
        Random random = new Random(150);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину матрицы: ");
        width = in.nextInt();
        System.out.print("Введите высоту матрицы: ");
        height = in.nextInt();
        int [][] Matrix = new int [width][height];
        for (int i = 0 ; i <width; i++) {
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(150);
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintColumn(){
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите столб матрицы: ");
        int column = in.nextInt();
        for(int i = 0; i<height;i++){
            System.out.print("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n");
        }
    }
}
