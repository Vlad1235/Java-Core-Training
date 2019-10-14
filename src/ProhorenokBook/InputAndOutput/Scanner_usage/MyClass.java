package ProhorenokBook.InputAndOutput.Scanner_usage;

import java.util.Scanner;
/*
* Деление одного числа на другое*/

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = 0;
        float y = 0;
        System.out.println(" x = ");
        x = scanner.nextInt();
        System.out.println(" y = ");
        y = scanner.nextInt();
        if(y==0){
            System.err.println("На ноль делить нельзя");
//            System.exit(1); // завершение выполнение программы. 1 способ
            return; // 2 способ
        } else {
            System.out.println("Результат равен = " + (x/y));
        }
    }
}
