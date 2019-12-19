package Java_PatternAPK.Patterns;

public class Pattern39 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < count; j++) {
                System.out.print(j + i);
            }
            count++;
            System.out.println();
        }
    }
}
/*
    1
   123
  12345
 1234567
123456789
 */