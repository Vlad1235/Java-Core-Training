package Java_PatternAPK.Patterns;

/**
 11111
 2222
 333
 44
 5
 */
public class Pattern16 {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5 - x; y++) {
                System.out.print(x + 1);
            }
            System.out.println();
        }
    }
}
