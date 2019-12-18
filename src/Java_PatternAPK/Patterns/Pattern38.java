package Java_PatternAPK.Patterns;

public class Pattern38 {
    public static void main(String[] args) {
        String str = "ABCDEFGHI";
        int count = 0;
        int num=0;
        for (int x = 0; x < 5; x++) {
            for (int j = 4; j > x; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= x; j++) {
                System.out.print(str.charAt(num));
            }
            for (int j = 0; j < count; j++) {
                System.out.print(str.charAt(num));
            }
            num+=2;
            count++;
            System.out.println();
        }

    }
}
/*
    A
   CCC
  EEEEE
 GGGGGGG
IIIIIIIII
 */