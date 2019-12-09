package Java_PatternAPK.Patterns;

/**
 1
 22
 333
 4444
 55555
 */
public class Pattern11 {
    public static void main(String[] args) {
        for (int x=1;x<=5;x++){
            for (int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
