public class Calculate {
    public static void main(String[] args) {

    int a = 20;
    int b = ~a;
    System.out.println(b);
    }
}
/*
побитовое дополнение "~" (только для целых) – инвертирует все биты поля числа (меняет 0 на 1 и 1 на 0);
a = 00000000 00000000 00000000 00001111
b = 11111111 11111111 11111111 11110000
 */