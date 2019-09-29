package ProhorenokBook.OperatoryIcycles;

public class ByteChangeOperators {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("%8s\n", Integer.toBinaryString(x)); //1100100
        System.out.println(Integer.valueOf(x)); // 100  - сделал обратный перевод из байт в интегер.
        x = x << 1; // сдвиг влево на 1 и заполнение справа нулем своего бывшего места.
        System.out.printf("%8s\n", Integer.toBinaryString(x));// 11001000
        System.out.println(Integer.valueOf(x)); // 200  - сделал обратный перевод из байт в интегер.
    }
}
/*
 1100100
100
11001000
200

 */