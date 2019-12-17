package Java_PatternAPK.Patterns;

public class Pattern37 {
    public static void main(String[] args) {
        int count = 1;
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'E'; j > i; j--) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            for (int x = 1; x < count; x++) {
                System.out.print(i);
            }
            count++;
            System.out.println();
        }
    }
}
/*
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE
 */