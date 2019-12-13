package Java_PatternAPK.Patterns;

public class Pattern33 {
    public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
/*
ABCDE
 ABCD
  ABC
   AB
    A
 */