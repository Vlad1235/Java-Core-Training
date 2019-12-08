package ProhorenokBook.booleanlogic;

/**
 * Сдвиги по битам.
 */
public class Move {
    public static void main(String[] args) {
        int x = 143_124_098;
        System.out.printf("%32s\n",Integer.toBinaryString(x));//    1000100001111110011010000010
        x=x<<1;
        System.out.printf("%32s\n",Integer.toBinaryString(x));//   10001000011111100110100000100
        x=x<<3; //Сдвиг влево с учетом знака
        System.out.printf("%32s\n",Integer.toBinaryString(x));//10001000011111100110100000100000 Важно! видно что сдвиг не только первый бит , а ВСЕ биты сдвигаются!
        System.out.println(x); // -2_004_981_728
        System.out.println(Integer.MIN_VALUE); //-2_147_483_648

        int y = 146_324_432;
        System.out.printf("%32s\n",Integer.toBinaryString(y));//    1000101110001011101111010000
        y=y>>3; //Сдвиг вправо с учетом знака
        System.out.printf("%32s\n",Integer.toBinaryString(y));//       1000101110001011101111010
        y=y>>>4;// если число положительное то знак остается тотже
        System.out.printf("%32s\n",Integer.toBinaryString(y));//           100010111000101110111

        int z = -130_343_123;
        System.out.printf("%32s\n",Integer.toBinaryString(z));//11111000001110110001111100101101
        z>>=3; //видно,что сохраняет(учитывает) знак
        System.out.printf("%32s\n",Integer.toBinaryString(z));//11111111000001110110001111100101
        z>>>=3; // знак поменялся
        System.out.printf("%32s\n",Integer.toBinaryString(z));//   11111111000001110110001111100
       // z=<<<2; нет такого оператора!

        int a = 15;
        System.out.printf("%32s\n",Integer.toBinaryString(a));//                            1111
        int b;
        b = ~a;
        System.out.printf("%32s\n",Integer.toBinaryString(b));//11111111111111111111111111110000
        System.out.println(b);//-16

    }
}
