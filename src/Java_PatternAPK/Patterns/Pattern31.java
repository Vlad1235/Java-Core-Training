package Java_PatternAPK.Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
/*
12345
 1234
  123
   12
    1
 */