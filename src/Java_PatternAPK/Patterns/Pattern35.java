package Java_PatternAPK.Patterns;

public class Pattern35 {
    public static void main(String[] args) {
        int x = 2;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 5; j > i+1; j--) { // +1 так как надо убрать отступ
                System.out.print(" ");
            }
            for (int k = 0; k < x; k++) {
                System.out.print("*");
            }
            x += 2;
            System.out.println();
        }
    }
}
/*

 */