package Java_PatternAPK.Patterns;

public class Pattern41 {
    public static void main(String[] args) {
        int count = 1;
        String chars="ABCDEFGHI";
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(chars.charAt(j));
            }
            for (int j = 0; j < count; j++) {
                System.out.print(chars.charAt(j + i));
            }
            count++;
            System.out.println();
        }
    }
}
