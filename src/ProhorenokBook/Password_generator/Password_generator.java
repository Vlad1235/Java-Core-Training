package ProhorenokBook.Password_generator;

import java.util.Scanner;

/**
 * Программа генератор пароля
 */
public class Password_generator {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину желаемого пароля: ");
        x = scanner.nextInt();
        Input input = new Input(x);
        System.out.println();
        System.out.println("Ваш пароль: \n");
        System.out.println(input.getCount_value());

    }

}
