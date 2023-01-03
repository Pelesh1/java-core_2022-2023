package lr6;

public class Example5 {
    public static void main(String[] args) {
        int n = 5;
        int proverk = (n*(n+1)*(2*n+1)/6);
        boolean proverka;
        System.out.println("Рекурсия");
        int Rec = squareSum.SquareSum1(n);
        proverka = Rec == proverk;
        System.out.println("Вычисление cуммы квадратов числа"+" "+n+" = "+Rec+" ("+proverka+")");
        System.out.println("\nБез рекурсии");
        int NoRec = squareSum.SquareSum2(n);
        proverka = NoRec == proverk;
        System.out.println("Вычисление cуммы квадратов числа"+" "+n+" = "+NoRec+" ("+proverka+")");
    }
    private static class squareSum {
        private static int SquareSum1(int n) {
            int result =0;
            System.out.println(n + "*");
            if (n <= 1) return 1;
            result += SquareSum1(n-1)+n*n;
            return result;
        }
        private static int SquareSum2(int n){
            int result=0;
            int x = n;
            int s = 2;
            for(int i=n; i>0;i--){
                System.out.println(x + "*");
                result = (int)Math.pow(x,s) + result;
                x--;
            }
            return result;
        }
    }
}
/*
Напишите программу со статическим методом, которым вычисляется сумма
квадратов натуральных чисел 1^2 + 2^2 + 3^3 + ... + n^2. Число п передается аргументом методу.
Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно
использовать формулу 1^2 + 2^2 +3^2+...+n^2 = ( n+l) (2n + 1)/6
 */

