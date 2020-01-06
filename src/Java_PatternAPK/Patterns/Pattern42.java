package Java_PatternAPK.Patterns;

public class Pattern42 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHI";
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int x = 5; x > i; x--) {
                System.out.print(" ");
            }
            for (int j = count; j >= 0; j--) {
                System.out.print(alphabet.charAt(j));
            }
            count += 2;
            System.out.println();
        }
    }
}
/*
     A
    CBA
   EDCBA
  GFEDCBA
 IHGFEDCBA
 */