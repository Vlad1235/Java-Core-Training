package Java_PatternAPK.Patterns;

/**
 A
 BB
 CCC
 DDDD
 EEEEE
 */
public class Pattern13 {
    public static void main(String[] args) {
        for (char x = 'A'; x <= 'E'; x++) {
            for (char y = 'A'; y <= x; y++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
