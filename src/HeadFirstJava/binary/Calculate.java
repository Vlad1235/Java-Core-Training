package HeadFirstJava.binary;

public class Calculate {
    public static void main(String[] args) {

/*
побитовое дополнение "~" (только для целых) – зеркально инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0);
a = 00000000 00000000 00000000 00001111
b = 11111111 11111111 11111111 11110000
 */
        int a = 20;
        int b = ~a;
        System.out.println(b);


        int x = 10;
        x = ~x;
        System.out.println(x); // -11
        String bynary = Integer.toBinaryString(x);
        System.out.print(bynary); //11111111111111111111111111110101

    }
}
