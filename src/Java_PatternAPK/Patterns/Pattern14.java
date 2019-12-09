package Java_PatternAPK.Patterns;

/**
 A
 AB
 ABC
 ABCD
 ABCDE
 */
public class Pattern14 {
    public static void main(String[] args) {
        for (char x = 'A'; x <= 'E'; x++) {
            for (char y = 'A'; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
