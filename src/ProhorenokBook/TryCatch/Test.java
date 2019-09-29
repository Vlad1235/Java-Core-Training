package ProhorenokBook.TryCatch;

import java.util.Scanner;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        int x = 0, result = 0, count = 0;
        String s = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 'stop' для получения результата");
        while (true) {
            System.out.print("Введите число: ");
            s = in.nextLine();
            if (s.equals("stop")) break;
            try {
                x = Integer.parseInt(s);
                if (x == 0) break;
                result += x;
                count = 0;
            }
            catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое число!");
                count++;
                if (count > 3) break; // Три попытки подряд
            }
        }
        System.out.println("Сумма чисел равна: " + result);
    }

}
