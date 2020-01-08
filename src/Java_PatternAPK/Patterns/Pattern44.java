package Java_PatternAPK.Patterns;

public class Pattern44 {
    public static void main(String[] args) {
        String abc = "ABCDE";
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(abc.charAt(j));
            }
            for (int j = 0; j < i; j++) {
                System.out.print(abc.charAt(j + 1));
            }
            System.out.println();
        }
    }
}
