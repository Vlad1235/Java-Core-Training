package Java_PatternAPK.Patterns;

public class Pattern43 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
/*
    0
   101
  21012
 3210123
432101234
 */