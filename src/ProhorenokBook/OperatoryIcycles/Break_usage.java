package ProhorenokBook.OperatoryIcycles;

import java.util.Scanner;

public class Break_usage {
    public static void main(String[] args) {
        int x = 0, result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 0 для получения результата\n");
        for(;;){ // вечный цикл.
            System.out.println("Введите число: ");
            x = scanner.nextInt();
                if(x==0) break;
                result +=x; // каждый раз присвоение числа, которое ввел пользователь.
        }
        System.out.println("Сумма чисел равна: " + result);
    }
}
/*
Введите число 0 для получения результата

Введите число:
5
Введите число:
5
Введите число:
5
Введите число:
0
Сумма чисел равна: 15
 */