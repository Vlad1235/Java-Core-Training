package ProhorenokBook.InputAndOutput.Scanner_usage;

import java.util.Scanner;
/*
* Суммирование двух введенных значений.
* */

public class Suming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("x = ");
        x = in.nextInt();
        System.out.println("y = ");
        y = in.nextInt();
        System.out.println("the Sum is: " + (x+y));
    }
}
