package Java_PatternAPK.Patterns;

/**
 *****
 ****
 ***
 **
 *
 */
public class Pattern15 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 1; y <= 5 - x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
