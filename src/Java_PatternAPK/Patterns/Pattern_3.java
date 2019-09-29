package Java_PatternAPK.Patterns;

public class Pattern_3 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.print(" ");
            for (int j=5;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
12345 54321
12345 54321
12345 54321
12345 54321
12345 54321
 */