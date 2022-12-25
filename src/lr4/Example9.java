package lr4;

import java.util.Scanner;

public class Example9 {

    static String alphabet="абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static String encoding(String text, int key){
        text = text.toLowerCase();
        String verText = "";
        for (int i = 0; i<text.length();i++) {
            int charIndex = alphabet.indexOf(text.charAt(i));
            int newIndex = (charIndex + key) % 33;
            char cipherChar = alphabet.charAt(newIndex);
            verText = verText + cipherChar;
        }
        return verText;
    }

    public static String decoding(String vertext,int key){
        vertext = vertext.toLowerCase();
        String text ="";
        for (int i = 0; i<vertext.length(); i++){
            int charIndex = alphabet.indexOf(vertext.charAt(i));
            int newIndex = (charIndex - key) % 33;
            if (newIndex<0){
                newIndex = alphabet.length() + newIndex;
            }
            char plainchar = alphabet.charAt(newIndex);
            text = text + plainchar;
        }
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.println("Введите ключ: ");
        int Key = in.nextInt();

        String cipherText = encoding(text,Key);

        System.out.println("Тект после преобразования:" + cipherText);

        System.out.print("\nВыполнить обратное преобразование? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = in.next();
            if (reply.equalsIgnoreCase("y")) {
                String decryptStr = decoding(cipherText,Key);
                System.out.println(decryptStr);
                cool = true;
            }
            else if (reply.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
}
/*Напишите программу «Шифр Цезаря», в которой
необходимо реализовать собственный алфавит, остальные условия идентичны
задаче 8.
 */
