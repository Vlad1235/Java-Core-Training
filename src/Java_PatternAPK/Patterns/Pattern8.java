package Java_PatternAPK.Patterns;

/**
 EEEEE
 DDDDD
 CCCCC
 BBBBB
 AAAAA
 */
public class Pattern8 {
    public static void main(String[] args) {
        char x, y;
        for (x = 'E'; x >= 'A'; x--) {
            for (y = 'A'; y <= 'E'; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
