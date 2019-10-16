package ProhorenokBook.InputAndOutput.Console_usage;

import java.io.Console;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * Программа для проверки правельности ввода пароля.
 *
 * При работе с паролями не следует хранить их в строках. Лучше использовать массивы и в них хранить пароль в зашифрованном виде(массив vp хранит в зашифр виде пароль "123456")
 * В примере используется алгоритм шифрования MD5. Пароль, закодированный алгоритмом нельзя расшировать, можно лишь выполнитьь шифрование введеного пароля и сравнить хэщ-коды.
 * Для шифрования паролей с помощью алгоритма MD5 используется класс MessageDigest.
 * метод digest() - для получения защифрованных данных, возращает массив битов
 * метод update() - для добавления данных
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Console cons = System.console();
        if (cons != null) {
            char[] passwd = null;
            passwd = cons.readPassword("%s", "Введите пароль: ");
            char[] vp = {'e', '1', '0', 'a', 'd', 'c', '3', '9', '4',
                    '9', 'b', 'a', '5', '9', 'a', 'b', 'b', 'e',
                    '5', '6', 'e', '0', '5', '7', 'f', '2', '0',
                    'f', '8', '8', '3', 'e'};
            if ((passwd != null) &&
                    String.valueOf(vp).equals(md5(passwd))) {
                cons.printf("Пароль введен правильно%n");
                    Arrays.fill(passwd, ' '); // Очищаем массив
            }
            else {
                cons.printf("Пароль введен неправильно%n");
                System.exit(1); // Останавливаем программу
            }
            // Пользователь авторизован
            cons.printf("Конфетка :)%n");
        }
        else {
            System.out.println("Консоль не подключена");
        }
    }

    public static String md5(char[] ch) {
        if (ch == null || ch.length == 0) return null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(String.valueOf(ch).getBytes("UTF-8"));
            byte[] arr = md5.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                String s = Integer.toHexString(0xff & arr[i]);
                s = (s.length() == 1) ? "0" + s : s;
                sb.append(s);
            }
            return sb.toString();
        }
        catch (Exception e) {
            return null;
        }
    }

}
