package ProhorenokBook.OperatoryIcycles;
import java.util.Scanner;
/**
 * Супер полезное использование треарного оператора. Сразу возвращаемое значение присваивается переменной.
 */
public class TrenarnyOperator2 {
    private static String func1(){
        return "chet";
    }
    private static String func2(){
        return "nechet";
    }

    public static String s;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int x = scanner.nextInt();
        s = (x%2 == 0) ? func1():func2();
        System.out.println(s);
    }
}
/*
Input number:
5
nechet
* */