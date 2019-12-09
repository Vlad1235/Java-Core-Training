package Java_PatternAPK.Patterns;

/**
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class Pattern17 {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5 - x + 1; y++) {
                System.out.print(y);
            }
            System.out.println();
        }


        for (int x = 5; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
