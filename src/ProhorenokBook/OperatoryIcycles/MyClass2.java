package ProhorenokBook.OperatoryIcycles;

import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.println("Input number");
        try {
            x = scanner.nextInt();
            if (x % 2 == 0) {
                System.out.println(x + " - четное число");
            } else {
                System.out.println(x + " - нечетное число");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Input incorrect, try again");
        }
    }
}
