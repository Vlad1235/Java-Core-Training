package Java_PatternAPK.Patterns;

/**
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 ABCDE
 */
public class Pattern5 {
    public static void main(String[] args) {
        char x;
        char y;
        for (x = 'A'; x <= 'E'; x++) {
            for (y = 'A'; y <= 'E'; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
