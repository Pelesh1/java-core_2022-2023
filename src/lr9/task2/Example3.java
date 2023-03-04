package lr9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
        public static void main(String[] args) {
            WSetArray();
            SumArray(StatArray);
        }
        private static byte[] StatArray;
        private static void WSetArray(){
            try{SetArray();}
            catch (InputMismatchException e){
                System.out.println("Ввели некорректное значение ("+e+")");
                WSetArray();
            }
            catch (Exception e){
                System.out.println("Ввели отрицательное число ("+e+")");
                WSetArray();
            }
        }
        static class ByteRangeException extends InputMismatchException{
            ByteRangeException(){
                super("Число за пределами диапазона byte");
            }
        }
        private static void WInput(int i) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите byte элемент массива "+"["+(i+1)+"]");
                int temp=0;
                try{
                    temp=in.nextInt();
                    if(temp<-128||temp>127){
                        throw new ByteRangeException();}
                }catch(ByteRangeException e){
                    System.out.println("Значение за пределами диапазона byte ("+e+")");
                    WInput(i);}
                StatArray[i] = (byte)temp;
            }
            catch(InputMismatchException e){
                System.out.println("Введите число ("+e+")");
                WInput(i);}
        }
        private static void SetArray() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int x = in.nextInt();
            StatArray = new byte[x];
            for(int i=0;i<x;i++){
                WInput(i);
            }
        }
        private static void SumArray(byte [] InputArray){
            int X=0;
            for (int j : InputArray) {
                X += (int) j;
            }
            System.out.println("Сумма элементов массива = ["+(X)+"]");
        }
    }

