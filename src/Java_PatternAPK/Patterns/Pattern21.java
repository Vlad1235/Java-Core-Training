package Java_PatternAPK.Patterns;

/**
 54321
 5432
 543
 54
 5
 */
public class Pattern21 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 5; j >=1+i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
