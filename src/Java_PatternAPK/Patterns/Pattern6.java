package Java_PatternAPK.Patterns;

/**
 55555
 44444
 33333
 22222
 11111
 */
public class Pattern6 {
    public static void main(String[] args) {
        int count=0;
        for (int x = 5;x>=1;x--){
            for (int y = 5-count;y>=1;y--){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
