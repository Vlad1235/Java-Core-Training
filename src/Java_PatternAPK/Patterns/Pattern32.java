package Java_PatternAPK.Patterns;

public class Pattern32 {
    public static void main(String[] args) {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for (char k = 'A'; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
EEEEE
 DDDD
  CCC
   BB
    A
 */