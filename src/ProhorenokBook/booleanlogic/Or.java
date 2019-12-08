package ProhorenokBook.booleanlogic;

public class Or {
    public static void main(String[] args) {
        int x = 112;
        int y = 94;
        int z = x|y; // двоичное ИЛИ
        System.out.printf("%32s\n",Integer.toBinaryString(x));
        System.out.printf("%32s\n",Integer.toBinaryString(y));
        System.out.printf("%32s\n",Integer.toBinaryString(z));
    }
}
/*
                         1110000
                         1011110
                         1111110
 */