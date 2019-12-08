package ProhorenokBook.booleanlogic;

public class Xor {
    public static void main(String[] args) {
        int x = 112;
        int y = 94;
        int z = x^y; // двоичное исключающее ИЛИ  (если две 1 то будет 0)
        System.out.printf("%32s\n",Integer.toBinaryString(x));
        System.out.printf("%32s\n",Integer.toBinaryString(y));
        System.out.printf("%32s\n",Integer.toBinaryString(z));
    }
}
/*
                         1110000
                         1011110
                          101110
 */