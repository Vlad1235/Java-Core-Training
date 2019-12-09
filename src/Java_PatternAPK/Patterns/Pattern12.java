package Java_PatternAPK.Patterns;

/**
 1
 12
 123
 1234
 12345
 */
public class Pattern12 {
    public static void main(String[] args) {
        for (int x=1;x<=5;x++){
            for (int y=1;y<=x;y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
