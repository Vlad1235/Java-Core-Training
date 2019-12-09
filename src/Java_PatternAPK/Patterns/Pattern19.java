package Java_PatternAPK.Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; x <= 5; x++) {
            for (int y = 5; y >= 1 + count; y++) {
                for (char i = 'A'; i <= 'E'; i++) {
                    System.out.print(i);
                }
            }
            System.out.println();
            count++;
        }





    }
}
