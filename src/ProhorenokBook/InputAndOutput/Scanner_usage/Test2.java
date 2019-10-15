package ProhorenokBook.InputAndOutput.Scanner_usage;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int x = 0, result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Введите число 0 для получения результата\n");
        while (true) {
            System.out.print("Введите число: ");
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x == 0) break;
            }
            result += x;
            // Очищаем буфер
            if (in.hasNextLine()) in.nextLine();
            else {
                if (in.hasNextLine()) {
                    in.nextLine(); // Пропускаем ввод
                    System.out.println("Необходимо ввести целое число!");
                } else break;
            }
        }
        System.out.println("Сумма чисел равна: " + result);
    }
}

