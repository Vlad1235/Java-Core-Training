package Java_PatternAPK.Patterns;

public class Pattern36 {
    public static void main(String[] args) {
        int num = 1;
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            for (int j = 1; j < count; j++) {
                System.out.print(num);
            }
            num += 2;
            count++;
            System.out.println();
        }
    }
}
/*
    1
   333
  55555
 7777777
999999999
 */