package Java_PatternAPK.Patterns;

/**
 EEEEE
 DDDD
 CCC
 BB
 A
 */
public class Pattern22 {
    public static void main(String[] args) {
        int count=0;
        for (char x = 'E'; x >= 'A'; x--) {
            for (int i = 0; i < 5-count; i++) {
                System.out.print(x);
            }
            System.out.println();
            count++;
        }
    }
}
