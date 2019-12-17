package Java_PatternAPK.Patterns;

/**
 */
public class Pattern355 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = 0; j < count; j++) {
                System.out.print(i);
            }
            count++;
            System.out.println();
        }
    }
}
/*
    1
   222
  33333
 4444444
555555555
 */