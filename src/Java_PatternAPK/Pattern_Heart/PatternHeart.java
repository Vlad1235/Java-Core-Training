package Java_PatternAPK.Pattern_Heart;
/**
 * Код для прорисовки сердечка из точек.
 */
public class PatternHeart {
    public static void main(String[] args) {
        int i, j, n=10;
// Верхняя часть (два бугорка)
        for(i=n/2; i <= n; i+=2){
            for(j=1;j<n-i;j+=2){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
// Нижняя часть(гора вниз)
        for(i=n;i>=1;i--){
            for (j=i;j<n;j++){
                System.out.print(" ");
            }
            for (j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
