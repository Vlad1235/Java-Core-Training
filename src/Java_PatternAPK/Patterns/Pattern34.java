package Java_PatternAPK.Patterns;

public class Pattern34 {
    public static void main(String[] args) {
        int min_stars = 1;
        int p_height = 5;
        int p_space = p_height - 1;
        for (int i = 0; i < p_height; i++) {
            for (int j = p_space; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < min_stars; k++) {
                System.out.print("*");
            }
            min_stars += 2;
            System.out.println();
        }
    }
}
