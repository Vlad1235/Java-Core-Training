package Java_PatternAPK.Patterns;

/**
 AAAAA
 BBBB
 CCC
 DD
 E
 */
public class Pattern18 {
    public static void main(String[] args) {
        int z=0;
        for (char x = 'A'; x <= 'E'; x++) {
            for (int i = 5-z; i >=1 ; i--) {
                System.out.print(x);
            }
            System.out.println();
            z++;
        }
    }
}
