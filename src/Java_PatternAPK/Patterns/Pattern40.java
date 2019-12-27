package Java_PatternAPK.Patterns;

public class Pattern40 {
    public static void main(String[] args) {
        int count = 1;
        for (int x = 5; x >= 1; x--) {
            for (int y = 1; y < x; y++) {
                System.out.print(" ");
            }
            for (int i = count; i >= 1; i--) {
                System.out.print(i);
            }
            count +=2;
            System.out.println();
        }
    }
}
/*
    1
   321
  54321
 7654321
987654321
 */