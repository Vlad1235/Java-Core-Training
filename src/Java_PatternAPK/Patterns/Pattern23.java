package Java_PatternAPK.Patterns;

/**
 EDCBA
 EDCB
 EDC
 ED
 E
 */
public class Pattern23 {
    public static void main(String[] args) {
        int lim = 0;
        for (int i = 0; i < 5; i++) {
            int count = 5;
            for (char x = 'E'; x >= 'A'; x--) {
                if (count > lim) {
                    System.out.print(x);
                }
                count--;
            }
            System.out.println();
            lim++;
        }
    }
}
